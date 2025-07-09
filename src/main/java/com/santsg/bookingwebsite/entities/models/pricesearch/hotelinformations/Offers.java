package com.santsg.bookingwebsite.entities.models.pricesearch.hotelinformations;

import lombok.Data;
import java.util.List;

@Data
public class Offers {
    private int night;
    private boolean isAvailable;
    private int availability;
    private boolean availabilityChecked;
    private List<Rooms> rooms;
    private boolean isRefundable;
    private CancellationPolicies cancellationPolicies;
    private boolean thirdPartyOwnOffer;
    private List<Object> restrictions;
    private List<Object> warnings;
    private boolean isChannelManager;
    private String expiresOn;
    private String offerId;
    private String checkIn;
    private Price price;

}
