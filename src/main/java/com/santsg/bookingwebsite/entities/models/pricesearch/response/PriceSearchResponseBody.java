package com.santsg.bookingwebsite.entities.models.pricesearch.response;

import java.util.List;

import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Details;

import lombok.Data;

@Data
public class PriceSearchResponseBody {
    private String searchId;
    private String expiresOn;
    private List<Hotels> hotels;
    private Details details;
}
