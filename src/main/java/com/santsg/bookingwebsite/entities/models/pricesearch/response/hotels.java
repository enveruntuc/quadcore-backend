package com.santsg.bookingwebsite.entities.models.pricesearch.response;

import java.util.List;

import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Badges;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.BoardGroups;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Boards;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.City;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Country;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Description;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Facilities;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Geolocation;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.GiataInfo;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.HotelCategory;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Location;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Offers;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Themes;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Town;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Village;

import lombok.Data;

@Data
public class Hotels {
    private Geolocation geolocation;
    private double stars;
    private double rating;
    private List<Themes> themes;
    private List<Facilities> facilities;
    private Location location;
    private Country country;
    private Town town;
    private City city;
    private Village village;
    private GiataInfo giataInfo;
    private List<Offers> offers;
    private String address;
    private List<BoardGroups> boardGroups;
    private List<Boards> boards;
    private List<Badges> badges;
    private HotelCategory hotelCategory;
    private int orderNumber;
    private String originalName;
    private boolean hasThirdPartyOwnOffer;
    private ThirdPartyInformation thirdPartyInformation;
    private boolean hasChannelManagerOffer;
    private String code;
    private int provider;
    private String thumbnail;
    private String thumbnailFull;
    private Description description;
    private String id;
    private String name;
}
