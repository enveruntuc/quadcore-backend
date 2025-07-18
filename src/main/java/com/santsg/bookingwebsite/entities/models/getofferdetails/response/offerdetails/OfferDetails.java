package com.santsg.bookingwebsite.entities.models.getofferdetails.response.offerdetails;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.Hotel;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.ThirdPartyInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.santsg.bookingwebsite.entities.models.begintransaction.response.BeginTransactionResponse.PaymentDetail;
import com.santsg.bookingwebsite.entities.models.begintransaction.response.reservationinfo.ReservableInfo;
import com.santsg.bookingwebsite.entities.models.getoffers.response.offers.CancellationPolicy;
import com.santsg.bookingwebsite.entities.models.getoffers.response.offers.Price;
import com.santsg.bookingwebsite.entities.models.getoffers.response.offers.PriceBreakDown;


import lombok.Data;
import java.util.List;

@Data
public class OfferDetails {
    private String expiresOn;
    private String offerId;
    private String checkIn;
    private String checkOut;
    @JsonProperty("isSpecial")
    private boolean isSpecial;
    @JsonProperty("isAvailable")
    private boolean isAvailable;
    private int availability;
    @JsonProperty("isRefundable")
    private boolean isRefundable;
    private String notes;
    private Price price;
    private List<CancellationPolicy> cancellationPolicies;
    private List<PriceBreakDown> priceBreakdowns;
    private ThirdPartyInformation thirdPartyInformation;
    private ReservableInfo reservableInfo;
    private Price passengerAmountsToPay;
    private Price agencyCommissions;
    private Price agencySupplementCommissions;
    private List<Hotel> hotels;
    private List<ExtraService> extraServices;
    private int provider;
    private PaymentDetail paymentDetail;
}
