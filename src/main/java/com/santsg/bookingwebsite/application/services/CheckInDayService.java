package com.santsg.bookingwebsite.application.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santsg.bookingwebsite.entities.models.checkin.CheckInDayRequest;
import com.santsg.bookingwebsite.entities.models.checkin.CheckInDayResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import com.santsg.bookingwebsite.entities.shared.Globals;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

@Service
public class CheckInDayService {

    private final RestClient restClient;
    

    public CheckInDayService() {
       this.restClient = RestClient.create();
    }

    public ApiResponse<CheckInDayResponseBody> getCheckInDays(String token, CheckInDayRequest checkInDayRequest) {
        String apiUrl = Globals.API_URL + "/productservice/getcheckindates";

        try {
            String response = restClient.post()
                    .uri(apiUrl)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                    .body(checkInDayRequest)
                    .retrieve()
                    .body(String.class);

              ObjectMapper  objectMapper = new ObjectMapper();  

                ApiResponse<CheckInDayResponseBody> apiResponse = objectMapper
                .readValue(response,objectMapper.getTypeFactory()
                .constructParametricType( ApiResponse.class,CheckInDayResponseBody.class));

                return apiResponse;

        } catch (RestClientException | com.fasterxml.jackson.core.JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
