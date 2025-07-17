package com.santsg.bookingwebsite.entities.models.begintransaction.response.reservationinfo;

import lombok.Data;

@Data
public class ReservableInfo {
    private boolean reservable;
    private String optionDate;

}
