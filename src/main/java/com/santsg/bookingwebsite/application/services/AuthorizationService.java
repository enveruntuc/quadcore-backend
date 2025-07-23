package com.santsg.bookingwebsite.application.services;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santsg.bookingwebsite.entities.models.login.LoginRequest;
import com.santsg.bookingwebsite.entities.models.login.LoginResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import com.santsg.bookingwebsite.entities.shared.Globals; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class AuthorizationService {
    private static final Logger logger = LoggerFactory.getLogger(AuthorizationService.class);
    private final RestClient restClient;

    public AuthorizationService() {
        this.restClient = RestClient.create();
    }

    public String login(String username, String password, String agency) {
        String apiUrl = Globals.API_URL + "/authenticationservice/login";
        LoginRequest loginRequest = new LoginRequest(agency, username, password);
        logger.info("AuthorizationService.login called | username={} | agency={}", username, agency);
        try {
            String response = restClient.post()
                    .uri(apiUrl)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .body(loginRequest)
                    .retrieve()
                    .body(String.class);

            ObjectMapper objectMapper = new ObjectMapper();
            ApiResponse<LoginResponseBody> apiResponse = objectMapper.readValue(
                response,
                objectMapper.getTypeFactory().constructParametricType(ApiResponse.class, LoginResponseBody.class)
            );
            return apiResponse.getBody().getToken();
        } catch (RestClientException | com.fasterxml.jackson.core.JsonProcessingException e) {
         
            return null;
        }
    }
}
