package com.santsg.bookingwebsite.entities.models.pricesearch;

import java.util.List;

import com.santsg.bookingwebsite.entities.models.pricesearch.hotelinformations.Details;

import lombok.Data;

@Data
public class PriceSearchResponse {
    private String searchId;
    private String expiresOn;
    private List<hotels> hotels;
    private List<Object> tours;
    private Details details;
}
