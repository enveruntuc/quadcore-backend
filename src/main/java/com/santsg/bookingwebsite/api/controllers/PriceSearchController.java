package com.santsg.bookingwebsite.api.controllers;

import com.santsg.bookingwebsite.application.services.PriceSearchService;
import com.santsg.bookingwebsite.entities.models.pricesearch.request.PriceSearchRequest;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.PriceSearchResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pricesearch")
public class PriceSearchController {

    private final PriceSearchService priceSearchService;

    public PriceSearchController(PriceSearchService priceSearchService) {
        this.priceSearchService = priceSearchService;
    }

    @PostMapping
    public ApiResponse<PriceSearchResponseBody> getPriceSearch(@RequestHeader(HttpHeaders.AUTHORIZATION) String token,
            @RequestBody PriceSearchRequest priceSearchRequest) {

        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        return priceSearchService.getPriceSearch(token, priceSearchRequest);
    }
}
