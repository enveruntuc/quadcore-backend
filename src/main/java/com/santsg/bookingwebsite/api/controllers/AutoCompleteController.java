package com.santsg.bookingwebsite.api.controllers;

import com.santsg.bookingwebsite.application.services.AutoComplete;
import com.santsg.bookingwebsite.entities.models.autocomplete.ArrivalAutocompleteResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

@RestController
@RequestMapping("/search")
public class AutoCompleteController {

    private static final Logger logger = LoggerFactory.getLogger(AutoCompleteController.class);
    private final AutoComplete searchService;

    public AutoCompleteController(AutoComplete searchService) {
        this.searchService = searchService;
    }

    @PostMapping("/autocomplete")
    public ResponseEntity<ApiResponse<ArrivalAutocompleteResponseBody>> getArrivalAutocomplete(
            @RequestHeader(HttpHeaders.AUTHORIZATION) String authorization,
            @RequestBody Map<String, Object> body) {
        String token = authorization.replace("Bearer ", "");
        int productType = (int) body.getOrDefault("productType", 0);
        String query = (String) body.getOrDefault("query", "");
        String culture = (String) body.getOrDefault("culture", "");
        logger.info("Autocomplete endpoint called | userToken={} | productType={} | query={} | culture={}", token, productType, query, culture);
        ApiResponse<ArrivalAutocompleteResponseBody> response = searchService.getArrivalAutocomplete(token, productType,
                query, culture);
        if (response == null) {
            return ResponseEntity.status(500).body(null);
        }
        return ResponseEntity.ok(response);
    }
}
