package com.santsg.bookingwebsite.api.controllers;

import com.santsg.bookingwebsite.application.services.PriceSearchService;
import com.santsg.bookingwebsite.entities.models.pricesearch.request.PriceSearchRequest;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.PriceSearchResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pricesearch")
public class PriceSearchController {

    private static final Logger logger = LoggerFactory.getLogger(PriceSearchController.class);
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
        logger.info("Price search request | userToken={} | request={}", token, priceSearchRequest);
        return priceSearchService.getPriceSearch(token, priceSearchRequest);
    }
}
