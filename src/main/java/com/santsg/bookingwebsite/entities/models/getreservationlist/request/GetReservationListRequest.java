package com.santsg.bookingwebsite.entities.models.getreservationlist.request;

import java.util.List;

import lombok.Data;

@Data
public class GetReservationListRequest {
    private List<DateCriteria> dateCriterias;

    @Data
    public static class DateCriteria {
        private int type;
        private String from;
        private String to;
    }
}
