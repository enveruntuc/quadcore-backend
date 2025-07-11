package com.santsg.bookingwebsite.entities.models.pricesearch.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Location {
    private String name;
    private String countryId;
    private int provider;
    @JsonProperty("isTopRegion")
    private boolean isTopRegion;
    @JsonProperty("ownLocation")
    private boolean ownLocation;
    private String id;

}
