package com.santsg.bookingwebsite.entities.models.setreservationinfo.response;
import com.santsg.bookingwebsite.entities.models.begintransaction.response.ReservationData;

import lombok.Data;

@Data
public class SetReservationInfoResponseBody {
    private String transactionId;
    private String expiresOn;
    private int status;
    private int transactionType;
    private ReservationData reservationData;

}
