package com.santsg.bookingwebsite.api.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santsg.bookingwebsite.application.services.GetReservationDetailService;
import com.santsg.bookingwebsite.entities.models.getreservationdetail.request.GetReservationDetailRequest;
import com.santsg.bookingwebsite.entities.models.getreservationdetail.response.GetReservationDetailResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/getreservationdetail")
public class GetReservationDetailController {

    private static final Logger logger = LoggerFactory.getLogger(GetReservationDetailController.class);
    private final GetReservationDetailService getReservationDetailService;

    public GetReservationDetailController(GetReservationDetailService getReservationDetailService) {
        this.getReservationDetailService = getReservationDetailService;
    }

    @PostMapping
    public ApiResponse<GetReservationDetailResponseBody> getReservationDetail(
            @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
            @RequestBody GetReservationDetailRequest getReservationDetailRequest) {

        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        logger.info("Get reservation detail endpoint called | userToken={} | request={}", token, getReservationDetailRequest);
        return getReservationDetailService.getReservationDetail(token, getReservationDetailRequest);
    }

}
