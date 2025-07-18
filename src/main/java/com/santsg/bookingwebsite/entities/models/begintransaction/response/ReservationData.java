package com.santsg.bookingwebsite.entities.models.begintransaction.response;

import java.util.List;

import com.santsg.bookingwebsite.entities.models.begintransaction.response.BeginTransactionResponse.*;
import com.santsg.bookingwebsite.entities.models.begintransaction.response.reservationinfo.ReservationInfo;
import com.santsg.bookingwebsite.entities.models.begintransaction.response.services.Services;
import com.santsg.bookingwebsite.entities.models.setreservationinfo.request.CustomerInfo;

import lombok.Data;

@Data
public class ReservationData {
    private List<Traveller> travellers;
    private List<Object> invoices;
    private PaymentDetail paymentDetail;
    private ReservationInfo reservationInfo;
    private List<Services> services;
    private CustomerInfo customerInfo;
}
