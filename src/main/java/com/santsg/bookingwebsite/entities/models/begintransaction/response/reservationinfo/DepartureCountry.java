package com.santsg.bookingwebsite.entities.models.begintransaction.response.reservationinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DepartureCountry {

    private String code;
    private String internationalCode;
    private String name;
    private String internationalName;
    private String latitude;
    private String longitude;
    private int type;
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
