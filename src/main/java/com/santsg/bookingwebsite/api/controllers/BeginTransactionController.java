package com.santsg.bookingwebsite.api.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import com.santsg.bookingwebsite.application.services.BeginTransactionService;
import com.santsg.bookingwebsite.entities.models.begintransaction.request.BeginTransactionRequest;
import com.santsg.bookingwebsite.entities.models.begintransaction.response.BeginTransactionResponse;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/begintransaction")
public class BeginTransactionController {

    private static final Logger logger = LoggerFactory.getLogger(BeginTransactionController.class);
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
        logger.info("Begin transaction request | userToken={} | request={}", token, beginTransactionRequest);
        return beginTransactionService.beginTransaction(token, beginTransactionRequest);
    }

}
