package com.santsg.bookingwebsite.application.services;

import org.springframework.web.client.RestClient;

public class SearchService {
    private final RestClient restClient;

    public SearchService() {
        this.restClient = RestClient.create();
    }
    
    
    
}
