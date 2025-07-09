package com.santsg.bookingwebsite.application.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santsg.bookingwebsite.entities.models.currency.CurrencyRequest;
import com.santsg.bookingwebsite.entities.models.currency.CurrencyResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import com.santsg.bookingwebsite.entities.shared.Globals;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestClient;

@Service
public class CurrencyService {

    private final RestClient restClient;
    private final ObjectMapper objectMapper;

    public CurrencyService() {
        this.restClient = RestClient.create();
        this.objectMapper = new ObjectMapper();
    }

    public ApiResponse<CurrencyResponseBody> getCurrencies(String token) {
        String apiUrl = Globals.API_URL + "/lookupservice/getcurrencies";

        CurrencyRequest currencyRequest = new CurrencyRequest();

        try {
            

            

            String response = restClient.post()
                    .uri(apiUrl)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                    .body(currencyRequest)
                    .retrieve()
                    .body(String.class);

            ApiResponse<CurrencyResponseBody> apiResponse = objectMapper.readValue(
                    response,
                    objectMapper.getTypeFactory().constructParametricType(ApiResponse.class, CurrencyResponseBody.class)
            );

            return apiResponse;

        } catch (RestClientException | com.fasterxml.jackson.core.JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
