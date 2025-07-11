package com.santsg.bookingwebsite.entities.models.hotelproductinfo.response.address;

import lombok.Data;

@Data
public class CityAddress {
    private String name;
    private int provider;
    private boolean isTopRegion;
    private boolean ownLocation;

}
