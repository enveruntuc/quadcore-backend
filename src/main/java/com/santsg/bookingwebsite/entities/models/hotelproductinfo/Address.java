package com.santsg.bookingwebsite.entities.models.hotelproductinfo;

import lombok.Data;
import java.util.List;

@Data
public class Address {
    private City city;
    private List<String> addressLines;
    private String street;
    private String streetNumber;
    private Geolocation geolocation;
}