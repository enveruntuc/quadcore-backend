package com.santsg.bookingwebsite.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santsg.bookingwebsite.application.services.SetReservationInfoService;
import com.santsg.bookingwebsite.entities.models.setreservationinfo.request.SetReservationInfoRequest;
import com.santsg.bookingwebsite.entities.models.setreservationinfo.response.SetReservationInfoResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/setreservationinfo")
public class SetReservationInfoController {

    private static final Logger logger = LoggerFactory.getLogger(SetReservationInfoController.class);
    private final SetReservationInfoService setReservationInfoService;

    public SetReservationInfoController(SetReservationInfoService setReservationInfoService) {
        this.setReservationInfoService = setReservationInfoService;
    }

    @PostMapping
    public ApiResponse<SetReservationInfoResponseBody> setReservationInfo(
            @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
            @RequestBody SetReservationInfoRequest setReservationInfoRequest) {

        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        logger.info("Set reservation info endpoint called | userToken={} | request={}", token, setReservationInfoRequest);
        return setReservationInfoService.setReservationInfo(token, setReservationInfoRequest);
    }

}
