package com.santsg.bookingwebsite.entities.models.setreservationinfo.request;

import lombok.Data;

@Data
public class ContactPhone {
    private String countryCode;
    private String areaCode;
    private String phoneNumber;
}
