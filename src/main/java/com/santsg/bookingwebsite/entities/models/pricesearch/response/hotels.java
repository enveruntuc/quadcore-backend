package com.santsg.bookingwebsite.entities.models.pricesearch.response;

import java.util.List;
import lombok.Data;

@Data
public class hotels {
    private Geolocation geolocation;
    private double stars;
    private double rating;
    private List<Themes> themes;
    private List<Facilites> facilities;
    private Location location;
    private Country country;
    private City city;
    private GiataInfo giataInfo;
    private List<Offers> offers;
    private String address;
    private List<BoardGroups> boardGroups;
    private List<Boards> boards;
    private List<Object> badges;
    private HotelCategory hotelCategory;
    private boolean hasThirdPartyOwnOffer;
    private ThirdPartyInformation thirdPartyInformation;
    private boolean hasChannelManagerOffer;
    private int provider;
    private String thumbnail;
    private String thumbnailFull;
    private Description description;
    private String id;
    private String name;
}
