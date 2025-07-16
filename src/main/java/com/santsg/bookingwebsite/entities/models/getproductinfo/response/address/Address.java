package com.santsg.bookingwebsite.entities.models.getproductinfo.response.address;

import lombok.Data;
import java.util.List;

import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.City;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.Geolocation;

@Data
public class Address {

    private City city;
    private List<String> addressLines;
    private String street;
    private String streetNumber;
    private Geolocation geolocation;
}