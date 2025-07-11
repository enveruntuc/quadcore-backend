package com.santsg.bookingwebsite.entities.models.getproductinfo.response.address;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CityAddress {
    private String name;
    private int provider;
    @JsonProperty("isTopRegion")
    private boolean isTopRegion;
    private boolean ownLocation;

}
