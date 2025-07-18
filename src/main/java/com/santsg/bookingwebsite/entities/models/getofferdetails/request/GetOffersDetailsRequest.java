package com.santsg.bookingwebsite.entities.models.getofferdetails.request;
import java.util.List;
import lombok.Data;

@Data
public class GetOffersDetailsRequest {
    private List<String> offerIds;
    private String currency;
    private boolean getProductInfo;
}
