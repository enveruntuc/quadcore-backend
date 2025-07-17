package com.santsg.bookingwebsite.entities.models.begintransaction.response;

import lombok.Data;
import java.util.List;

import com.santsg.bookingwebsite.entities.models.begintransaction.response.services.Services;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.City;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.Country;

import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Price;

@Data
public class BeginTransactionResponse {
    private String transactionId;
    private String expiresOn;
    private ReservationData reservationData;
    private int status;
    private int transactionType;
    private List<Services> services;

    @Data
    public static class PassportInfo {
        private String serial;
        private String number;
        private String expireDate;
        private String issueDate;
        private String issueCountryCode;
        private String citizenshipCountryCode;
    }

    @Data
    public static class Address {
        private String phone;
        private ContactPhone contactPhone;
        private String email;
        private String address;
        private String zipCode;
        private City city;
        private Country country;
        private List<String> addressLines;
    }

    @Data
    public static class ContactPhone {
        private String code;
        private String number;
    }

    @Data
    public static class Service {
        private String id;
        private int type;
        private Price price;
        private int passengerType;
        private String orderNumber;
        private String note;

    }

    @Data
    public static class PaymentDetail {
        private List<PaymentPlan> paymentPlan;
        private List<Object> paymentInfo;
    }

    @Data
    public static class PaymentPlan {
        private int paymentNo;
        private String dueDate;
        private Price price;
        private boolean paymentStatus;
    }

}
