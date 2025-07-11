package com.santsg.bookingwebsite.entities.models.hotelproductinfo;

import com.santsg.bookingwebsite.entities.models.hotelproductinfo.seosans.Season;

import lombok.Data;
import java.util.List;

@Data
public class Hotel {
    private List<Season> seasons;
    private Address address;
    private String faxNumber;
    private String phoneNumber;
    private String homePage;
    private int stopSaleGuaranteed;
    private int stopSaleStandart;
    private List<Object> handicaps;
    private Geolocation geolocation;
    private int stars;
    private double rating;
    private List<Theme> themes;
    private Location location;
    private Country country;
    private City city;
    private GiataInfo giataInfo;
    private HotelCategory hotelCategory;
    private boolean hasChannelManagerOffer;
    private int provider;
    private String thumbnail;
    private String thumbnailFull;
    private Description description;
    private String id;
    private String name;
}