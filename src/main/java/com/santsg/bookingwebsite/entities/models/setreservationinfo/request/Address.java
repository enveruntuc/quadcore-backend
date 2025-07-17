package com.santsg.bookingwebsite.entities.models.setreservationinfo.request;

import lombok.Data;

@Data
public class Address {
     
    private String phone;
    private String email;
    private String address;
    private String zipCode;
    private City city;
    private Country country;
}