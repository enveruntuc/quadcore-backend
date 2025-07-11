package com.santsg.bookingwebsite.entities.models.hotelproductinfo.response;

import lombok.Data;

@Data
public class City {

    private String name;
    private String latitude;
    private String longitude;
    private int provider;
    private boolean isTopRegion;
    private boolean ownLocation;
}