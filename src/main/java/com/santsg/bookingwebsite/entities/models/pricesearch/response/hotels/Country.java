package com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Country {

    private String internationalCode;
    private String name;
    private int provider;
    @JsonProperty("isTopRegion")
    private boolean isTopRegion;
    @JsonProperty("ownLocation")
    private boolean ownLocation;

}
