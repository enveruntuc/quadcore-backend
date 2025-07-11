package com.santsg.bookingwebsite.entities.models.hotelproductinfo.response;

import lombok.Data;
import java.util.List;

import com.santsg.bookingwebsite.entities.models.autocomplete.Geolocation;

@Data
public class Address {
    private City city;
    private List<String> addressLines;
    private String street;
    private String streetNumber;
    private Geolocation geolocation;
}