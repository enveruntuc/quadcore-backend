package com.santsg.bookingwebsite.entities.models.begintransaction.request;

import lombok.Data;

@Data
public class BeginTransactionRequest {

    private String[] offerIds;
    private String currency;
    private String culture;

}
