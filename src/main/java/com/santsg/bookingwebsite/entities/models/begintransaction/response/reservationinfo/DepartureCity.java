package com.santsg.bookingwebsite.entities.models.begintransaction.response.reservationinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DepartureCity {

    private String code;
    private String name;
    private String internationalName;
    private int type;
    private String latitude;
    private String longitude;
    private String parentId;
    private String countryId;
    private String changeDate;
    private int provider;
    @JsonProperty("isTopRegion")
    private boolean isTopRegion;
    private boolean ownLocation;
    private int displayOrder;
    private String id;

}
