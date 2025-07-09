package com.santsg.bookingwebsite.entities.models.pricesearch;

import lombok.Data;

@Data
public class RequestStaticEntities {

    private boolean checkAllotment = true;
    private boolean checkStopSale = true;
    private boolean getOnlyDiscountedPrice = false;
    private boolean getOnlyBestOffers = true;
    private int productType = 2;

}
