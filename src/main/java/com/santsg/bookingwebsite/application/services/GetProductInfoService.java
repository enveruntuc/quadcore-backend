package com.santsg.bookingwebsite.application.services;

import org.springframework.http.HttpHeaders;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santsg.bookingwebsite.entities.models.getproductinfo.request.GetProductInfoRequest;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.GetProductInfoResponse;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import com.santsg.bookingwebsite.entities.shared.Globals;

@Service
public class GetProductInfoService {

    private final RestClient restClient;

    public GetProductInfoService() {
        this.restClient = RestClient.create();
    }

    public ApiResponse<GetProductInfoResponse> getProductInfo(String token,
            GetProductInfoRequest getProductInfoRequest) {
        String apiUrl = Globals.API_URL + "/productservice/getproductinfo";

        try {
            String response = restClient.post()
                    .uri(apiUrl)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                    .body(getProductInfoRequest)
                    .retrieve()
                    .body(String.class);

            ObjectMapper objectMapper = new ObjectMapper();
            ApiResponse<GetProductInfoResponse> apiResponse = objectMapper.readValue(
                    response,
                    objectMapper.getTypeFactory().constructParametricType(ApiResponse.class,
                            GetProductInfoResponse.class));

            return apiResponse;

        } catch (RestClientException | com.fasterxml.jackson.core.JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
