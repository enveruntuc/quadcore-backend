package com.santsg.bookingwebsite.application.services;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.santsg.bookingwebsite.entities.models.begintransaction.request.BeginTransactionRequest;
import com.santsg.bookingwebsite.entities.models.begintransaction.response.BeginTransactionResponse;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import com.santsg.bookingwebsite.entities.shared.Globals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class BeginTransactionService {
    private static final Logger logger = LoggerFactory.getLogger(BeginTransactionService.class);

    private final RestClient restClient;

    public BeginTransactionService() {
        this.restClient = RestClient.create();
    }

    public ApiResponse<BeginTransactionResponse> beginTransaction(String token, BeginTransactionRequest beginTransactionRequest) {
        logger.info("BeginTransactionService.beginTransaction called | userToken={} | request={}", token, beginTransactionRequest);
        String apiUrl = Globals.API_URL + "/bookingservice/begintransaction";
        try {

            String response = restClient.post()
                    .uri(apiUrl)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                    .body(beginTransactionRequest)
                    .retrieve()
                    .body(String.class);

            ObjectMapper objectMapper = new ObjectMapper();
            ApiResponse<BeginTransactionResponse> apiResponse = objectMapper.readValue(
                    response,
                    objectMapper.getTypeFactory().constructParametricType(ApiResponse.class,
                            BeginTransactionResponse.class));
            return apiResponse;
        } catch (RestClientException | JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
