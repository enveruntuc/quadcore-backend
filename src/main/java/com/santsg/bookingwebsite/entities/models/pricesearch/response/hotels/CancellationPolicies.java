package com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels;

import lombok.Data;

@Data
public class CancellationPolicies {

    private String roomNumber;
    private String dueDate;
    private Price price;
    private int provider;

}
