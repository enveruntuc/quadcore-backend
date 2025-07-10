package com.santsg.bookingwebsite.application.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santsg.bookingwebsite.entities.models.checkout.CheckOutDayRequest;
import com.santsg.bookingwebsite.entities.models.checkout.CheckOutDayResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import com.santsg.bookingwebsite.entities.shared.Globals;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

@Service
public class CheckOutDayService {

    private final RestClient restClient;
    private final ObjectMapper objectMapper;

    public CheckOutDayService() {
        this.restClient = RestClient.create();
        this.objectMapper = new ObjectMapper();
    }

    public ApiResponse<CheckOutDayResponseBody> getCheckOutDays(String token) {
        String apiUrl = Globals.API_URL + "/lookupservice/getcheckoutdays";

        CheckOutDayRequest request = new CheckOutDayRequest();

        try {
            String response = restClient.post()
                    .uri(apiUrl)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                    .body(request)
                    .retrieve()
                    .body(String.class);

            ApiResponse<CheckOutDayResponseBody> apiResponse = objectMapper.readValue(
                    response,
                    objectMapper.getTypeFactory().constructParametricType(ApiResponse.class, CheckOutDayResponseBody.class)
            );

            return apiResponse;

        } catch (RestClientException | com.fasterxml.jackson.core.JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}