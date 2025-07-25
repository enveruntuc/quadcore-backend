package com.santsg.bookingwebsite.application.services;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santsg.bookingwebsite.entities.models.getreservationdetail.request.GetReservationDetailRequest;
import com.santsg.bookingwebsite.entities.models.getreservationdetail.response.GetReservationDetailResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import com.santsg.bookingwebsite.entities.shared.Globals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class GetReservationDetailService {
    private static final Logger logger = LoggerFactory.getLogger(GetReservationDetailService.class);

    private final RestClient restClient;

    public GetReservationDetailService() {
        this.restClient = RestClient.create();
    }

    public ApiResponse<GetReservationDetailResponseBody> getReservationDetail(String token,
            GetReservationDetailRequest getReservationDetailRequest) {
        String apiUrl = Globals.API_URL + "/bookingservice/getreservationdetail";
        logger.info("GetReservationDetailService.getReservationDetail called | userToken={} | request={}", token, getReservationDetailRequest);

        try {
            String response = restClient.post()
                    .uri(apiUrl)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                    .body(getReservationDetailRequest)
                    .retrieve()
                    .body(String.class);

            ObjectMapper objectMapper = new ObjectMapper();
            ApiResponse<GetReservationDetailResponseBody> apiResponse = objectMapper.readValue(
                    response,
                    objectMapper.getTypeFactory().constructParametricType(ApiResponse.class,
                            GetReservationDetailResponseBody.class));

            return apiResponse;

        } catch (RestClientException | com.fasterxml.jackson.core.JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
