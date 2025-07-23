package com.santsg.bookingwebsite.application.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santsg.bookingwebsite.entities.models.autocomplete.ArrivalAutoCompleteRequest;
import com.santsg.bookingwebsite.entities.models.autocomplete.ArrivalAutocompleteResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import com.santsg.bookingwebsite.entities.shared.Globals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

@Service
public class AutoComplete {
    private final RestClient restClient;

    private static final Logger logger = LoggerFactory.getLogger(AutoComplete.class);

    public AutoComplete() {
        this.restClient = RestClient.create();
    }

    public ApiResponse<ArrivalAutocompleteResponseBody> getArrivalAutocomplete(String token, int productType,
            String query, String culture) {
        String apiUrl = Globals.API_URL + "/productservice/getarrivalautocomplete";
        logger.info(
                "AutoComplete.getArrivalAutocomplete called | userToken={} | productType={} | query={} | culture={}",
                token, productType, query, culture);
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
