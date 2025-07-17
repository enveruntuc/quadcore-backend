package com.santsg.bookingwebsite.entities.models.setreservationinfo.request;

import lombok.Data;
import java.util.List;

import com.santsg.bookingwebsite.entities.models.begintransaction.response.Traveller;

@Data
public class SetReservationInfoRequest {
    private String transactionId;
    private String agencyReservationNumber;
    private String reservationNote;
    private CustomerInfo customerInfo;
    private List<Traveller> travellers;
}