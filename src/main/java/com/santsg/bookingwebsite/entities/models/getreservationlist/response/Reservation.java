package com.santsg.bookingwebsite.entities.models.getreservationlist.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.santsg.bookingwebsite.entities.models.begintransaction.response.BeginTransactionResponse.PaymentPlan;
import com.santsg.bookingwebsite.entities.models.begintransaction.response.reservationinfo.DepartureCity;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Price;

import lombok.Data;

@Data
public class Reservation {
    private String reservationNumber;
    private String encryptedReservationNumber;
    private String beginDate;
    private String endDate;
    private int night;
    private String country;
    private String leaderName;
    private String agency;
    private String agencyUser;
    private int adult;
    private int child;
    private String registerDate;
    private int reservationStatus;
    private int confirmationStatus;
    private int paymentStatus;
    @JsonProperty("isPayAtHotel")
    private boolean isPayAtHotel;
    private Price salePrice;
    private DepartureCity departureCity;
    private DepartureCity arrivalCity;
    private String reservationNote;
    private boolean readByOperator;
    private String serviceTypes;
    private boolean newComment;
    private double agencyPayment;
    private double discount;
    private double agencyCommission;
    private double brokerCommission;
    private int gsaCommission;
    private double agencyDiscountCommission;
    private double agencyEarlyBooking;
    private double agencyAmountToPay;
    private double passengerAmountToPay;
    private double passengerEarlyBooking;
    private int passengerBonus;
    private double usedPassengerBonus;
    private double agencyBonus;
    private double usedAgencyBonus;
    private double userBonus;
    private double usedUserBonus;
    private List<PaymentPlan> paymentPlan;
    private List<Documents> documents;
    private int customerId;
    private String customerName;
    private String customerSurname;
    private String agencyReservationNumber;
    private String supplierBookingNumber;
    private String cancellationDeadline;
    private List<Service> services;
    private boolean hasMessageHistory;
    private String supplierOrderNumber;
    private int invoiceStatus;
    private int rowNumber;
    private String sendSupplier;
    private int statConf;
    private boolean ownSupplier;
    private String createDate;
    private String confirmationDate;
    private int paymentFrom;
    private int pasPayment;

    @Data
    public static class Documents {
        private int documentType;
        private String url;
        @JsonProperty("isDefault")
        private boolean isDefault;
        private boolean proforma;
        private int fromToType;
    }

    @Data
    public static class Service {
        private String code;
        private String name;
        private int productType;
        private String serviceType;
        private String sendSupplier;
        private int statConf;
        private int statSer;
    }

}
