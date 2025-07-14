package com.santsg.bookingwebsite.entities.models.getoffers.request;

import lombok.Data;

@Data
public class GetOffersRequest {
    private String searchId;
    private String offerId;
    private int productType;
    private String productId;
    private String currency;
    private String culture;
    private boolean getRoomInfo;
}
