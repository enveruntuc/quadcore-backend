package com.santsg.bookingwebsite.application.services;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santsg.bookingwebsite.entities.models.committransaction.request.CommitTransactionRequest;
import com.santsg.bookingwebsite.entities.models.committransaction.response.CommitTransactionResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import com.santsg.bookingwebsite.entities.shared.Globals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class CommitTransactionService {
    private static final Logger logger = LoggerFactory.getLogger(CommitTransactionService.class);
    private final RestClient restClient;

    public CommitTransactionService() {
        this.restClient = RestClient.create();
    }

    public ApiResponse<CommitTransactionResponseBody> commitTransaction(String token,
            CommitTransactionRequest commitTransactionRequest) {
        logger.info("CommitTransactionService.commitTransaction called | userToken={} | request={}", token, commitTransactionRequest);
        String apiUrl = Globals.API_URL + "/bookingservice/committransaction";

        try {
            String response = restClient.post()
                    .uri(apiUrl)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                    .body(commitTransactionRequest)
                    .retrieve()
                    .body(String.class);

            ObjectMapper objectMapper = new ObjectMapper();
            ApiResponse<CommitTransactionResponseBody> apiResponse = objectMapper.readValue(
                    response,
                    objectMapper.getTypeFactory().constructParametricType(ApiResponse.class,
                            CommitTransactionResponseBody.class));

            return apiResponse;
        } catch (RestClientException | com.fasterxml.jackson.core.JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
