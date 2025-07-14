package com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Country {
    private String name;
    private int provider;
    @JsonProperty("isTopRegion")
    private boolean isTopRegion;
    private boolean ownLocation;
    private String id;
    private String longitude;
    private String latitude;
}