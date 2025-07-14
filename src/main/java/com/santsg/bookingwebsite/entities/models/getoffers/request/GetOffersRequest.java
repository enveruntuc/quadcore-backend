package com.santsg.bookingwebsite.entities.models.getoffers.request;

public class GetOffersRequest {
    private String searchId;
    private String offerId;
    private int productType;
    private String productId; // Bu PriceSearchResponse içindeki hotel.id olacak
    private String currency;
    private String culture;
    private boolean getRoomInfo;
}
