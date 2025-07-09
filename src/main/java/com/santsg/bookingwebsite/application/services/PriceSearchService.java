package com.santsg.bookingwebsite.application.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class PriceSearchService {

    private final RestClient restClient;

    public PriceSearchService() {
        this.restClient = RestClient.create();
    }

}
