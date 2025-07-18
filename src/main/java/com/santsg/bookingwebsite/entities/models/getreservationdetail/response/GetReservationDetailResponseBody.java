package com.santsg.bookingwebsite.entities.models.getreservationdetail.response;

import com.santsg.bookingwebsite.entities.models.begintransaction.response.ReservationData;

import lombok.Data;

@Data
public class GetReservationDetailResponseBody {
    private String reservationNumber;
    private String encryptedReservationNumber;
    private String transactionId;
    private String expiresOn;
    private ReservationData reservationData;
    private int status;

}
