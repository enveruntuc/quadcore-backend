package com.santsg.bookingwebsite.entities.models.getoffers.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.santsg.bookingwebsite.entities.models.getoffers.response.offers.Price;
import com.santsg.bookingwebsite.entities.models.getoffers.response.offers.PriceBreakdownGroup;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.CancellationPolicies;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Rooms;

import lombok.Data;

@Data
public class Offers {
    private int night;
    @JsonProperty("isAvailable")
    private boolean isAvailable;
    private int availability;
    private boolean availabilityChecked;
    private List<Rooms> rooms;
    @JsonProperty("isRefundable")
    private boolean isRefundable;
    private List<CancellationPolicies> cancellationPolicies;
    private boolean thirdPartyOwnOffer;
    private List<Object> restrictions;
    private List<Object> warnings;
    @JsonProperty("isChannelManager")
    private boolean isChannelManager;
    private String expiresOn;
    private String offerId;
    private String checkIn;
    private Price price;
    private List<PriceBreakdownGroup> priceBreakdowns;

}
