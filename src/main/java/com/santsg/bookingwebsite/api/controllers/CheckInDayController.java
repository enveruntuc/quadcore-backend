package com.santsg.bookingwebsite.api.controllers;

import com.santsg.bookingwebsite.application.services.CheckInDayService;
import com.santsg.bookingwebsite.entities.models.checkin.CheckInDayRequest;
import com.santsg.bookingwebsite.entities.models.checkin.CheckInDayResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkin")
public class CheckInDayController {

    private static final Logger logger = LoggerFactory.getLogger(CheckInDayController.class);
    private final CheckInDayService checkInDayService;

    public CheckInDayController(CheckInDayService checkInDayService) {
        this.checkInDayService = checkInDayService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<CheckInDayResponseBody>> getCheckInDays(
            @RequestHeader("Authorization") String authorizationHeader,
            @RequestBody CheckInDayRequest checkInDayRequest) {

        String token = authorizationHeader.replace("Bearer ", "");
        logger.info("Check-in day endpoint called | userToken={} | request={}", token, checkInDayRequest);
        ApiResponse<CheckInDayResponseBody> response = checkInDayService.getCheckInDays(token, checkInDayRequest);

        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(500).build();
        }
    }
}
