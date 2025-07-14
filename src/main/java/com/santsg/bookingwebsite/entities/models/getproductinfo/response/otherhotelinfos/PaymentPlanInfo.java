package com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos;

import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Price;

import lombok.Data;

@Data
public class PaymentPlanInfo {
    private int id;
    private int phase;
    private int day;
    private int paymentTimeStatus;
    private Price price;

}
