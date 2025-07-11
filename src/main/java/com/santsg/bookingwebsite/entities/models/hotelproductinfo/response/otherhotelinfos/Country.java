package com.santsg.bookingwebsite.entities.models.hotelproductinfo.response.otherhotelinfos;

import lombok.Data;

@Data
public class Country {
    private String name;
    private int provider;
    private boolean isTopRegion;
    private boolean ownLocation;
    private String id;
}