package com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Facilities {
    @JsonProperty("isPriced")
    private boolean isPriced;
    private String id;
    private String name;

}
