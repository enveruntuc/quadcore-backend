package com.santsg.bookingwebsite.entities.models.begintransaction.response.reservationinfo;

import java.util.List;
import java.util.Map;

import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Price;

import lombok.Data;

@Data
public class ReservationInfo {
        private String bookingNumber;
        private Market market;
        private Operator operator;
        private Agency agency;
        private AgencyUser agencyUser;
        private String beginDate;
        private String endDate;
        private Price salePrice;
        private Price supplementDiscount;
        private Price passengerEB;
        private Price agencyEB;
        private Price passengerAmountToPay;
        private Price agencyAmountToPay;
        private Price discount;
        private Price agencyBalance;
        private Price passengerBalance;
        private Price agencyCommission;
        private Price brokerCommission;
        private Price agencySupplementCommission;
        private Price promotionAmount;
        private Price priceToPay;
        private Price agencyPriceToPay;
        private Price passengerPriceToPay;
        private Price totalPrice;
        private int reservationStatus;
        private int confirmationStatus;
        private int paymentStatus;
        private List<Object> documents;
        private List<Object> otherDocuments;
        private ReservableInfo reservableInfo;
        private int paymentFrom;
        private DepartureCountry departureCountry;
        private DepartureCity departureCity;
        private DepartureCountry arrivalCountry;
        private DepartureCity arrivalCity;
        private String createDate;
        private Map<String, Object> additionalFields;
        private String additionalCode1;
        private String additionalCode2;
        private String additionalCode3;
        private String additionalCode4;
        private String additionalCode5;
        private String additionalCode6;
        private String additionalCode7;
        private String additionalCode8;
        private String additionalCode9;
        private double agencyDiscount;
        private boolean hasAvailablePromotionCode;
        private String note;
        private String changeDate;

}
