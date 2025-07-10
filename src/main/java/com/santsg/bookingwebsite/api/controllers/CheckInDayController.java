package com.santsg.bookingwebsite.api.controllers;

import com.santsg.bookingwebsite.application.services.CheckInDayService;
import com.santsg.bookingwebsite.entities.models.checkin.CheckInDayRequest;
import com.santsg.bookingwebsite.entities.models.checkin.CheckInDayResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkin")
public class CheckInDayController {

    private final CheckInDayService checkInDayService;

    public CheckInDayController(CheckInDayService checkInDayService) {
        this.checkInDayService = checkInDayService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<CheckInDayResponseBody>> getCheckInDays(
            @RequestHeader("Authorization") String authorizationHeader,
            @RequestBody CheckInDayRequest checkInDayRequest) {

        String token = authorizationHeader.replace("Bearer ", "");
        ApiResponse<CheckInDayResponseBody> response = checkInDayService.getCheckInDays(token, checkInDayRequest);

        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(500).build();
        }
    }
}
