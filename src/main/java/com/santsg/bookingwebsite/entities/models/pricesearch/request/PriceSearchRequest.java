package com.santsg.bookingwebsite.entities.models.pricesearch.request;

import java.util.List;
import lombok.Data;

@Data
public class PriceSearchRequest {
    private boolean checkAllotment;
    private boolean checkStopSale;
    private boolean getOnlyDiscountedPrice;
    private boolean getOnlyBestOffers;
    private int productType;
    private List<ArrivalLocations> arrivalLocations;
    private List<RoomCriteria> roomCriteria;
    private String nationality;
    private String checkIn;
    private int night;
    private String currency;
    private String culture;
}
