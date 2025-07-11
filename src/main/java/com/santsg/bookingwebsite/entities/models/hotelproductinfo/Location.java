package com.santsg.bookingwebsite.entities.models.hotelproductinfo;

import lombok.Data;

@Data
public class Location {
    private String name;
    private String latitude;
    private String longitude;
    private int provider;
    private boolean isTopRegion;
    private boolean ownLocation;
    private String id;
} 