package com.santsg.bookingwebsite.api.controllers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santsg.bookingwebsite.entities.models.login.LoginRequest;
import com.santsg.bookingwebsite.application.services.AuthorizationService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthorizationService authorizationService;

    public AuthController(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        return authorizationService.login(loginRequest.getUser(), loginRequest.getPassword(), loginRequest.getAgency());
    }


    
}
