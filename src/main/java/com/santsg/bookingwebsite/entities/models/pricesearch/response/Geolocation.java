package com.santsg.bookingwebsite.entities.models.pricesearch.response;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Geolocation {
    private String longitude;
    private String latitude;
}
