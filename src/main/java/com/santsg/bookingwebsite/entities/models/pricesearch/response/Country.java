package com.santsg.bookingwebsite.entities.models.pricesearch.response;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Country {

    private String internationalCode;
    private String name;
    private int provider;
    private boolean isTopRegion;
    private boolean ownLocation;

}
