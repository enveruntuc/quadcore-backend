package com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Location {
    private String name;
    private String latitude;
    private String longitude;
    private int provider;
    @JsonProperty("isTopRegion")
    private boolean isTopRegion;
    private boolean ownLocation;
    private String id;
}