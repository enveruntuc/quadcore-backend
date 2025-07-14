package com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Town {

    private String latitude;
    private String longitude;
    private int provider;
    private String id;
    private String name;
    @JsonProperty("isTopRegion")
    private boolean isTopRegion;
    private boolean ownLocation;

}
