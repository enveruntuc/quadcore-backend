package com.santsg.bookingwebsite.entities.models.begintransaction.response.services;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.santsg.bookingwebsite.entities.models.begintransaction.response.BeginTransactionResponse.Address;

import com.santsg.bookingwebsite.entities.models.begintransaction.response.reservationinfo.DepartureCity;
import com.santsg.bookingwebsite.entities.models.begintransaction.response.reservationinfo.DepartureCountry;
import com.santsg.bookingwebsite.entities.models.begintransaction.response.reservationinfo.ReservableInfo;
import com.santsg.bookingwebsite.entities.models.getoffers.response.offers.CancellationPolicy;
import com.santsg.bookingwebsite.entities.models.getoffers.response.offers.Price;
import com.santsg.bookingwebsite.entities.models.getoffers.response.offers.PriceBreakDown;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.Geolocation;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.ThirdPartyInformation;

import lombok.Data;

@Data
public class Services {
    private int orderNumber;
    private String note;
    private DepartureCountry departureCountry;
    private DepartureCity departureCity;
    private DepartureCountry arrivalCountry;
    private DepartureCity arrivalCity;
    private ServiceDetails serviceDetails;
    @JsonProperty("isMainService")
    private boolean isMainService;
    @JsonProperty("isRefundable")
    private boolean isRefundable;
    private String partnerServiceId;
    private boolean bundle;
    private List<CancellationPolicy> cancellationPolicies;
    private List<Object> documents;
    private List<PriceBreakDown> priceBreakDowns;
    private String encryptedServiceNumber;
    private double commission;
    private ReservableInfo reservableInfo;
    private int unit;
    private List<Object> conditionalSpos;
    private int confirmationStatus;
    private int serviceStatus;
    private int productType;
    private boolean createServiceTypeIfNotExists;
    private String id;
    private String code;
    private String name;
    private String beginDate;
    private String endDate;
    private int adult;
    private int child;
    private int infant;
    private Price price;
    private boolean includePackage;
    private boolean compulsory;
    @JsonProperty("isExtraService")
    private boolean isExtraService;
    private int provider;
    private List<String> travellers;
    private boolean thirdPartyRecord;
    private int recordId;
    private Map<String, Object> additionalFields;
    @JsonProperty("isThirdPartyOwnOffer")
    private boolean isThirdPartyOwnOffer;
    @JsonProperty("isThirdPartyOwnProvider")
    private boolean isThirdPartyOwnProvider;
    private ThirdPartyInformation thirdPartyInformation;

    @Data
    public static class ServiceDetails {
        private String serviceId;
        private HotelDetail hotelDetail;
        private int night;
        private String roomCode;
        private String room;
        private String boardCode;
        private String board;
        private String accom;
        private String star;
        private Geolocation geoLocation;
        private String thumbnail;

        @Data
        public static class HotelDetail {
            private Address address;
            private String faxNumber;
            private String phoneNumber;
            private String homePage;
            private DepartureCity transferLocation;
            private int stopSaleGuaranteed;
            private int stopSaleStandart;
            private List<Object> handicaps;
            private double stars;
            private DepartureCity location;
            private DepartureCountry country;;
            private DepartureCity city;
            private boolean hasChannelManagerOffer;
            private String id;
            private String name;
            private List<Object> restrictions;
            private Geolocation geolocation;
            private String thumbnail;
        }

    }
}
