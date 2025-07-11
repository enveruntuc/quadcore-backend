package com.santsg.bookingwebsite.entities.models.getproductinfo.request;

import lombok.Data;

@Data
public class GetProductInfoRequest {

    private Integer productType;
    private Integer ownerProvider;
    private String product;
    private String culture;

}