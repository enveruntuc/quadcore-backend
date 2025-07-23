package com.santsg.bookingwebsite.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santsg.bookingwebsite.application.services.GetOffersService;
import com.santsg.bookingwebsite.entities.models.getoffers.request.GetOffersRequest;
import com.santsg.bookingwebsite.entities.models.getoffers.response.GetOffersResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.http.HttpHeaders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/getoffers")
public class GetOffersController {

    private static final Logger logger = LoggerFactory.getLogger(GetOffersController.class);
    private final GetOffersService getOffersService;

    public GetOffersController(GetOffersService getOffersService) {
        this.getOffersService = getOffersService;
    }

    @PostMapping
    public ApiResponse<GetOffersResponseBody> getOffers(
            @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
            @RequestBody GetOffersRequest getOffersRequest) {

        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        logger.info("Get offers endpoint called | userToken={} | request={}", token, getOffersRequest);
        return getOffersService.getOffers(token, getOffersRequest);
    }

}
