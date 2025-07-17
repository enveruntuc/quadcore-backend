package com.santsg.bookingwebsite.entities.models.begintransaction.response.reservationinfo;

import lombok.Data;

@Data
public class AgencyUser {
    private Office office;
    private Operator operator;
    private Market market;
    private Agency agency;
    private String name;
    private String code;

    @Data
    public static class Office {
        private String code;
        private String name;
    }

    @Data
    public static class Operator {
        private String code;
        private String name;
        private boolean agencyCanDiscountCommission;
    }

}
