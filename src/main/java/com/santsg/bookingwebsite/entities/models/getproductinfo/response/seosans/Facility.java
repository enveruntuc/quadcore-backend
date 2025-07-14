package com.santsg.bookingwebsite.entities.models.getproductinfo.response.seosans;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Facility {
    private String id;
    private String name;
    private String note;
    @JsonProperty("isPriced")
    private boolean isPriced;
    private boolean higlighted;
}