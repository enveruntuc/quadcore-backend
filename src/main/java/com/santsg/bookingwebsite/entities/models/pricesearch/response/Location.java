package com.santsg.bookingwebsite.entities.models.pricesearch.response;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Location {
    private String name;
    private String countryId;
    private int provider;
    private boolean isTopRegion;
    private boolean ownLocation;
    private String id;

}
