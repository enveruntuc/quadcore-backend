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

@Service
public class GetReservationDetailService {

    private final RestClient restClient;

    public GetReservationDetailService() {
        this.restClient = RestClient.create();
    }

    public ApiResponse<GetReservationDetailResponseBody> getReservationDetail(String token,
            GetReservationDetailRequest getReservationDetailRequest) {
        String apiUrl = Globals.API_URL + "/bookingservice/getreservationdetail";

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
