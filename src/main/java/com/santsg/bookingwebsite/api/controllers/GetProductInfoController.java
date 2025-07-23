package com.santsg.bookingwebsite.api.controllers;

import com.santsg.bookingwebsite.application.services.GetProductInfoService;
import com.santsg.bookingwebsite.entities.models.getproductinfo.request.GetProductInfoRequest;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.GetProductInfoResponse;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productinfo")
public class GetProductInfoController {

    private static final Logger logger = LoggerFactory.getLogger(GetProductInfoController.class);
    private final GetProductInfoService getProductInfoService;

    public GetProductInfoController(GetProductInfoService getProductInfoService) {
        this.getProductInfoService = getProductInfoService;
    }

    @PostMapping
    public ApiResponse<GetProductInfoResponse> getProductInfo(@RequestHeader(HttpHeaders.AUTHORIZATION) String token,
            @RequestBody GetProductInfoRequest getProductInfoRequest) {

        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        logger.info("Get product info endpoint called | userToken={} | request={}", token, getProductInfoRequest);
        return getProductInfoService.getProductInfo(token, getProductInfoRequest);

    }

}
