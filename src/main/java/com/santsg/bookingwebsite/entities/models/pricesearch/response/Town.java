package com.santsg.bookingwebsite.entities.models.pricesearch.response;

import lombok.Data;

@Data
public class Town {
    private String name;
    private String latitude;
    private String longitude;
    private int provider;
    private String id;
}
