package com.santsg.bookingwebsite.entities.models.getoffers.response.offers;

import lombok.Data;

@Data
public class CancellationPolicy {

    private int roomNumber;
    private String dueDate;
    private Price price;
    private int provider;
    private String beginDate;
}