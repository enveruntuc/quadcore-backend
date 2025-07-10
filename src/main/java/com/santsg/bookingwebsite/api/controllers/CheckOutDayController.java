package com.santsg.bookingwebsite.api.controllers;

import com.santsg.bookingwebsite.application.services.CheckOutDayService;
import com.santsg.bookingwebsite.entities.models.checkout.CheckOutDayResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkout")
public class CheckOutDayController {

    private final CheckOutDayService checkOutDayService;

    public CheckOutDayController(CheckOutDayService checkOutDayService) {
        this.checkOutDayService = checkOutDayService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<CheckOutDayResponseBody>> getCheckOutDays(
            @RequestHeader("Authorization") String authorizationHeader) {

        String token = authorizationHeader.replace("Bearer ", "");

        ApiResponse<CheckOutDayResponseBody> response = checkOutDayService.getCheckOutDays(token);

        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(500).build();
        }
    }
}