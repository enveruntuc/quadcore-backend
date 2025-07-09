package com.santsg.bookingwebsite.entities.models.pricesearch.hotelinformations;

import lombok.Data;

@Data
public class Location {
    private String name;
    private String countryId;
    private int provider;
    private boolean isTopRegion;
    private boolean ownLocation;
    private String id;

}
