package com.santsg.bookingwebsite.entities.models.pricesearch.response;

import lombok.Data;

@Data
public class Country {

    private String internationalCode;
    private String name;
    private int provider;
    private boolean isTopRegion;
    private boolean ownLocation;

}
