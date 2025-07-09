package com.santsg.bookingwebsite.api.controllers;

import com.santsg.bookingwebsite.application.services.SearchService;
import com.santsg.bookingwebsite.entities.models.autocomplete.ArrivalAutocompleteResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/search")
public class SearchController {

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
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
        ApiResponse<ArrivalAutocompleteResponseBody> response = searchService.getArrivalAutocomplete(token, productType,
                query, culture);
        if (response == null) {
            return ResponseEntity.status(500).body(null);
        }
        return ResponseEntity.ok(response);
    }
}
