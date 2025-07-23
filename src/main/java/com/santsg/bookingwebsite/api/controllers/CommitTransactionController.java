package com.santsg.bookingwebsite.api.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpHeaders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.santsg.bookingwebsite.application.services.CommitTransactionService;
import com.santsg.bookingwebsite.entities.models.committransaction.request.CommitTransactionRequest;
import com.santsg.bookingwebsite.entities.models.committransaction.response.CommitTransactionResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;

@RestController
@RequestMapping("/api/committransaction")
public class CommitTransactionController {

    private static final Logger logger = LoggerFactory.getLogger(CommitTransactionController.class);
    private final CommitTransactionService commitTransactionService;

    public CommitTransactionController(CommitTransactionService commitTransactionService) {
        this.commitTransactionService = commitTransactionService;
    }

    @PostMapping
    public ApiResponse<CommitTransactionResponseBody> commitTransaction(
            @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
            @RequestBody CommitTransactionRequest commitTransactionRequest) {

        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        logger.info("Commit transaction endpoint called | userToken={} | request={}", token, commitTransactionRequest);
        return commitTransactionService.commitTransaction(token, commitTransactionRequest);
    }

}
