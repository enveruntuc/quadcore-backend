package com.santsg.bookingwebsite.entities.models.getreservationlist.response;

import java.util.List;

import lombok.Data;

@Data
public class GetReservationListResponseBody {
    private int totalCount;
    private int maxIndexNumber;
    private int minIndexNumber;

    private List<Reservation> reservations;

}
