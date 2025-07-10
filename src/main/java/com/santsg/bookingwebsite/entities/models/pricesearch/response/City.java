package com.santsg.bookingwebsite.entities.models.pricesearch.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class City {

    private String name;
    private String countryId;
    private int provider;
    private boolean isTopRegion;
    private boolean ownLocation;
    private String id;

}
