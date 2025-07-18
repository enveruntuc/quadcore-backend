package com.santsg.bookingwebsite.application.services;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santsg.bookingwebsite.entities.models.getreservationlist.request.GetReservationListRequest;
import com.santsg.bookingwebsite.entities.models.getreservationlist.response.GetReservationListResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import com.santsg.bookingwebsite.entities.shared.Globals;

@Service
public class GetReservationListService {

    private final RestClient restClient;

    public GetReservationListService() {
        this.restClient = RestClient.create();
    }

    public ApiResponse<GetReservationListResponseBody> getReservationList(String token,
            GetReservationListRequest getReservationListRequest) {
        String apiUrl = Globals.API_URL + "/bookingservice/getreservationlist";

        try {
            String response = restClient.post()
                    .uri(apiUrl)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                    .body(getReservationListRequest)
                    .retrieve()
                    .body(String.class);
            ObjectMapper objectMapper = new ObjectMapper();
            ApiResponse<GetReservationListResponseBody> apiResponse = objectMapper.readValue(
                    response,
                    objectMapper.getTypeFactory().constructParametricType(ApiResponse.class,
                            GetReservationListResponseBody.class));
            return apiResponse;
        } catch (RestClientException | com.fasterxml.jackson.core.JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
