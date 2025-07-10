package com.santsg.bookingwebsite.entities.models.pricesearch.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Facilites {
    @JsonProperty("isPriced")
    private boolean isPriced;
    private String id;
    private String name;

}
