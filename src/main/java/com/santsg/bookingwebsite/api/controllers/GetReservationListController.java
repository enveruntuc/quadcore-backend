package com.santsg.bookingwebsite.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santsg.bookingwebsite.application.services.GetReservationListService;
import com.santsg.bookingwebsite.entities.models.getreservationlist.request.GetReservationListRequest;
import com.santsg.bookingwebsite.entities.models.getreservationlist.response.GetReservationListResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/getreservationlist")
public class GetReservationListController {

    private static final Logger logger = LoggerFactory.getLogger(GetReservationListController.class);
    private final GetReservationListService getReservationListService;

    public GetReservationListController(GetReservationListService getReservationListService) {
        this.getReservationListService = getReservationListService;
    }

    @PostMapping
    public ApiResponse<GetReservationListResponseBody> getReservationList(
            @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
            @RequestBody GetReservationListRequest getReservationListRequest) {

        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        logger.info("Get reservation list endpoint called | userToken={} | request={}", token, getReservationListRequest);
        return getReservationListService.getReservationList(token, getReservationListRequest);
    }

}
