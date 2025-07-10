package com.santsg.bookingwebsite.entities.models.hotelproductinfo;

import lombok.Data;

@Data
public class HotelProductInfoRequest {

    private Integer productType;
    private Integer ownerProvider;
    private String product;
    private String culture;

}