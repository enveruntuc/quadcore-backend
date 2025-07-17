package com.santsg.bookingwebsite.entities.models.getoffers.response.offers;

import lombok.Data;
import java.util.List;

@Data
public class PriceBreakdownGroup {
    private int productType;
    private List<PriceBreakDown> priceBreakdowns;
}