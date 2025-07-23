package com.santsg.bookingwebsite.application.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santsg.bookingwebsite.entities.models.pricesearch.request.PriceSearchRequest;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.PriceSearchResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import com.santsg.bookingwebsite.entities.shared.Globals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

@Service
public class PriceSearchService {
    private static final Logger logger = LoggerFactory.getLogger(PriceSearchService.class);

    private final RestClient restClient;

    public PriceSearchService() {
        this.restClient = RestClient.create();
    }

    public ApiResponse<PriceSearchResponseBody> getPriceSearch(String token, PriceSearchRequest priceSearchRequest) {
        String apiUrl = Globals.API_URL + "/productservice/pricesearch";
        logger.info("PriceSearchService.getPriceSearch called | userToken={} | request={}", token, priceSearchRequest);
        try {
            String response = restClient.post()
                    .uri(apiUrl)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                    .body(priceSearchRequest)
                    .retrieve()
                    .body(String.class);

            ObjectMapper objectMapper = new ObjectMapper();
            ApiResponse<PriceSearchResponseBody> apiResponse = objectMapper.readValue(
                    response,
                    objectMapper.getTypeFactory().constructParametricType(ApiResponse.class, PriceSearchResponseBody.class)
            );
            return apiResponse;
        } catch (RestClientException | com.fasterxml.jackson.core.JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
