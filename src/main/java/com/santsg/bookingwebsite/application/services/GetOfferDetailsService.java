package com.santsg.bookingwebsite.application.services;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santsg.bookingwebsite.entities.models.getofferdetails.request.GetOffersDetailsRequest;
import com.santsg.bookingwebsite.entities.models.getofferdetails.response.OfferDetailsResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import com.santsg.bookingwebsite.entities.shared.Globals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class GetOfferDetailsService {
    private static final Logger logger = LoggerFactory.getLogger(GetOfferDetailsService.class);

    private final RestClient restClient;

    public GetOfferDetailsService() {
        this.restClient = RestClient.create();
    }

    public ApiResponse<OfferDetailsResponseBody> getOfferDetails(String token, GetOffersDetailsRequest request) {
        String apiUrl = Globals.API_URL + "/productservice/getofferdetails";
        try {
            String response = restClient.post()
                    .uri(apiUrl)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                    .body(request)
                    .retrieve()
                    .body(String.class);

            ObjectMapper objectMapper = new ObjectMapper();
            ApiResponse<OfferDetailsResponseBody> apiResponse = objectMapper.readValue(
                    response,
                    objectMapper.getTypeFactory().constructParametricType(ApiResponse.class, OfferDetailsResponseBody.class)
            );
            return apiResponse;
        } catch (RestClientException | com.fasterxml.jackson.core.JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }


    
}
