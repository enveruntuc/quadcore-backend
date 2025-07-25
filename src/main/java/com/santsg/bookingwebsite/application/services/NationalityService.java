package com.santsg.bookingwebsite.application.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santsg.bookingwebsite.entities.models.nationalty.NationalitiesResponseBody;
import com.santsg.bookingwebsite.entities.models.nationalty.NationalityRequest;
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
public class NationalityService {
    private static final Logger logger = LoggerFactory.getLogger(NationalityService.class);
    private final RestClient restClient;

    public NationalityService() {
        this.restClient = RestClient.create();
    }

    public ApiResponse<NationalitiesResponseBody> getNationalities(String token) {
        String apiUrl = Globals.API_URL + "/lookupservice/getnationalities";
        logger.info("NationalityService.getNationalities called | userToken={}", token);
        NationalityRequest nationalityRequest = new NationalityRequest();
        try {
            String response = restClient.post()
                    .uri(apiUrl)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                    .body(nationalityRequest)
                    .retrieve()
                    .body(String.class);

            ObjectMapper objectMapper = new ObjectMapper();
            ApiResponse<NationalitiesResponseBody> apiResponse = objectMapper.readValue(
                    response,
                    objectMapper.getTypeFactory().constructParametricType(ApiResponse.class,
                            NationalitiesResponseBody.class));
            return apiResponse;
        } catch (RestClientException | com.fasterxml.jackson.core.JsonProcessingException e) {
            return null;
        }
    }
}
