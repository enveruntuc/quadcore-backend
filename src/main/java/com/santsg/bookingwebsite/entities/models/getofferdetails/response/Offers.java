package com.santsg.bookingwebsite.entities.models.getofferdetails.response;
import lombok.Data;

import com.santsg.bookingwebsite.entities.models.getoffers.response.offers.Price;
import com.santsg.bookingwebsite.entities.models.getoffers.response.offers.PriceBreakDown;

@Data
public class Offers {
    private PriceBreakDown priceBreakDown;
    private int willBePayAt;
    private String checkIn;
    private Price price;
}
