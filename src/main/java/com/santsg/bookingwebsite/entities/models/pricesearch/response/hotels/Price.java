package com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels;

import lombok.Data;

@Data
public class Price {
    private double amount;
    private String currency;
    private double percent;
    private double oldAmount;
}
