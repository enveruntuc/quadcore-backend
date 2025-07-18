package com.santsg.bookingwebsite.entities.models.committransaction.response;

import lombok.Data;

@Data
public class CommitTransactionResponseBody {
    private String reservationNumber;
    private String encryptedReservationNumber;
    private String transactionId;

}
