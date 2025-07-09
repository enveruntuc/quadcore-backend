package com.santsg.bookingwebsite.application.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santsg.bookingwebsite.entities.models.search.ArrivalAutoCompleteRequest;
import com.santsg.bookingwebsite.entities.models.search.ArrivalAutocompleteResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import com.santsg.bookingwebsite.entities.shared.Globals;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

@Service
public class SearchService {
    private final RestClient restClient;

    public SearchService() {
        this.restClient = RestClient.create();
    }

    public ApiResponse<ArrivalAutocompleteResponseBody> getArrivalAutocomplete(String token, int productType,
            String query, String culture) {
        String apiUrl = Globals.API_URL + "/productservice/getarrivalautocomplete";
        ArrivalAutoCompleteRequest autoCompleteRequest = new ArrivalAutoCompleteRequest();
        autoCompleteRequest.setProductType(productType);
        autoCompleteRequest.setQuery(query);
        autoCompleteRequest.setCulture(culture);

        try {
            String response = restClient.post()
                    .uri(apiUrl)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                    .body(autoCompleteRequest)
                    .retrieve()
                    .body(String.class);

            ObjectMapper objectMapper = new ObjectMapper();
            ApiResponse<ArrivalAutocompleteResponseBody> apiResponse = objectMapper.readValue(
                    response,
                    objectMapper.getTypeFactory().constructParametricType(ApiResponse.class,
                            ArrivalAutocompleteResponseBody.class));
            return apiResponse;
        } catch (RestClientException | com.fasterxml.jackson.core.JsonProcessingException e) {
            return null;
        }

    }
}
