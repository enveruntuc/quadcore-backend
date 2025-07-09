package com.santsg.bookingwebsite.api.controllers;

import com.santsg.bookingwebsite.application.services.NationalityService;
import com.santsg.bookingwebsite.entities.models.nationalty.NationalitiesResponseBody;
import com.santsg.bookingwebsite.entities.shared.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/nationalities")
public class NationalityController {

    private final NationalityService nationalityService;

    public NationalityController(NationalityService nationalityService) {
        this.nationalityService = nationalityService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<NationalitiesResponseBody>> getNationalities(
            @RequestHeader("Authorization") String authorizationHeader) {

        String token = authorizationHeader.replace("Bearer ", "");

        ApiResponse<NationalitiesResponseBody> response = nationalityService.getNationalities(token);

        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(500).build();
        }
    }
}
