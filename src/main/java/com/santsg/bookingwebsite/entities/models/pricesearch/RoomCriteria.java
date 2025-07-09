package com.santsg.bookingwebsite.entities.models.pricesearch;

import lombok.Data;

@Data
public class RoomCriteria {

    private int adult;
    private int[] childAges;

}
