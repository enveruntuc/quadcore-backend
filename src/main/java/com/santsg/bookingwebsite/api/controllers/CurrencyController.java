package com.santsg.bookingwebsite.api.controllers;

import com.santsg.bookingwebsite.application.services.CurrencyService;
import com.santsg.bookingwebsite.entities.models.currency.CurrencyResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/currency")
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<CurrencyResponseBody>> getCurrencies(
            @RequestHeader("Authorization") String authorizationHeader) {

        String token = authorizationHeader.replace("Bearer ", "");

        ApiResponse<CurrencyResponseBody> response = currencyService.getCurrencies(token);

        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(500).build();
        }
    }
}
