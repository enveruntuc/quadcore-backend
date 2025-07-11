package com.santsg.bookingwebsite.entities.models.hotelproductinfo.response.address;

import lombok.Data;
import java.util.List;

import com.santsg.bookingwebsite.entities.models.hotelproductinfo.response.Geolocation;

@Data
public class Address {

    private CityAddress city;
    private List<String> addressLines;
    private String street;
    private String streetNumber;
    private Geolocation geolocation;
}