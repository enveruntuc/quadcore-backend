package com.santsg.bookingwebsite.entities.models.hotelproductinfo.response;

import lombok.Data;
import java.util.List;

import com.santsg.bookingwebsite.entities.models.hotelproductinfo.response.address.Address;
import com.santsg.bookingwebsite.entities.models.hotelproductinfo.response.seosans.Season;

@Data
public class Hotel {

    private Address address;

    private City city;
    private Country country;
    private Description description;
    private Geolocation geolocation;
    private GiataInfo giataInfo;
    private List<Object> handicaps;
    private boolean hasChannelManagerOffer;
    private String homePage;
    private HotelCategory hotelCategory;
    private Location location;
    private String id;
    private String name;
    private String phoneNumber;
    private String faxNumber;
    private int provider;
    private double rating;
    private List<Season> seasons;
    private double stars;
    private int stopSaleGuaranteed;
    private int stopSaleStandart;
    private List<Theme> themes;
    private String thumbnail;
    private String thumbnailFull;
}