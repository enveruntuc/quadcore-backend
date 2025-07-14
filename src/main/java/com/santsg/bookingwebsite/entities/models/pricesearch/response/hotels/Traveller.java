package com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels;

import lombok.Data;

@Data
public class Traveller {
    private int type;
    private int age;
    private String nationality;
    private int minAge;
    private int maxAge;
}
