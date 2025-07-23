package com.santsg.bookingwebsite.api.controllers;
import org.springframework.web.bind.annotation.*;


import com.santsg.bookingwebsite.entities.models.login.LoginRequest;
import com.santsg.bookingwebsite.application.services.AuthorizationService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
    private final AuthorizationService authorizationService;

    public AuthController(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        logger.info("Login endpoint called | user={} | agency={}", loginRequest.getUser(), loginRequest.getAgency());
        return authorizationService.login(loginRequest.getUser(), loginRequest.getPassword(), loginRequest.getAgency());
    }


    
}
