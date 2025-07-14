package com.santsg.bookingwebsite.entities.models.getoffers.response.offers;
import lombok.Data;

@Data
public class PriceBreakdown {
    private String roomNumber;
    private String date;
    private Price price;
}