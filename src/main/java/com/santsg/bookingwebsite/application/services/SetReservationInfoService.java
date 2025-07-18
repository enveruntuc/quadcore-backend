package com.santsg.bookingwebsite.application.services;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santsg.bookingwebsite.entities.models.setreservationinfo.request.SetReservationInfoRequest;
import com.santsg.bookingwebsite.entities.models.setreservationinfo.response.SetReservationInfoResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import com.santsg.bookingwebsite.entities.shared.Globals;

@Service
public class SetReservationInfoService {

    private final RestClient restClient;

    public SetReservationInfoService() {
        this.restClient = RestClient.create();
    }

    public ApiResponse<SetReservationInfoResponseBody> setReservationInfo(String token,
            SetReservationInfoRequest setReservationInfoRequest) {
        String apiUrl = Globals.API_URL + "/bookingservice/setreservationinfo";
        try {
            String response = restClient.post()
                    .uri(apiUrl)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                    .body(setReservationInfoRequest)
                    .retrieve()
                    .body(String.class);

            ObjectMapper objectMapper = new ObjectMapper();
            ApiResponse<SetReservationInfoResponseBody> apiResponse = objectMapper.readValue(
                    response,
                    objectMapper.getTypeFactory().constructParametricType(ApiResponse.class,
                            SetReservationInfoResponseBody.class));
            return apiResponse;
        } catch (RestClientException | com.fasterxml.jackson.core.JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
