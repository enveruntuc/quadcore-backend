package com.santsg.bookingwebsite.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santsg.bookingwebsite.application.services.GetOfferDetailsService;
import com.santsg.bookingwebsite.entities.models.getofferdetails.request.GetOffersDetailsRequest;
import com.santsg.bookingwebsite.entities.models.getofferdetails.response.OfferDetailsResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import org.springframework.http.HttpHeaders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/getofferdetails")
public class GetOfferDetailsController {

    private static final Logger logger = LoggerFactory.getLogger(GetOfferDetailsController.class);
    private final GetOfferDetailsService getOfferDetailsService;
    public GetOfferDetailsController(GetOfferDetailsService getOfferDetailsService) {
        this.getOfferDetailsService = getOfferDetailsService;
    }

    @PostMapping
    public ApiResponse<OfferDetailsResponseBody> getOfferDetails(
            @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
            @RequestBody GetOffersDetailsRequest request) {

        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        logger.info("Get offer details endpoint called | userToken={} | request={}", token, request);
        return getOfferDetailsService.getOfferDetails(token, request);
    }
    
}
