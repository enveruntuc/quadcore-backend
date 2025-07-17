package com.santsg.bookingwebsite.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santsg.bookingwebsite.application.services.SetRezervationInfoService;
import com.santsg.bookingwebsite.entities.models.setreservationinfo.request.SetReservationInfoRequest;
import com.santsg.bookingwebsite.entities.models.setreservationinfo.response.SetReservationInfoResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
;


@RestController
@RequestMapping("/api/setreservationinfo")
public class SetReservationInfoController {

    private final SetRezervationInfoService setRezervationInfoService;

    public SetReservationInfoController(SetRezervationInfoService setRezervationInfoService) {
        this.setRezervationInfoService = setRezervationInfoService;
    }

    @PostMapping
    public ApiResponse<SetReservationInfoResponseBody> setReservationInfo(
            @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
            @RequestBody SetReservationInfoRequest setReservationInfoRequest) {

        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        return setRezervationInfoService.setReservationInfo(token, setReservationInfoRequest);
    }
    

    

    
}
