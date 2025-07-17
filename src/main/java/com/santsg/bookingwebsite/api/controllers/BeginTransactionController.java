package com.santsg.bookingwebsite.api.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import com.santsg.bookingwebsite.application.services.BeginTransactionService;
import com.santsg.bookingwebsite.entities.models.begintransaction.request.BeginTransactionRequest;
import com.santsg.bookingwebsite.entities.models.begintransaction.response.BeginTransactionResponse;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;

@RestController
@RequestMapping("/api/begintransaction")
public class BeginTransactionController {

    private final BeginTransactionService beginTransactionService;

    public BeginTransactionController(BeginTransactionService beginTransactionService) {
        this.beginTransactionService = beginTransactionService;
    }

    @PostMapping
    public ApiResponse<BeginTransactionResponse> beginTransaction(
            @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
            @RequestBody BeginTransactionRequest beginTransactionRequest) {

        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        return beginTransactionService.beginTransaction(token, beginTransactionRequest);
    }

}
