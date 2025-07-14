package com.santsg.bookingwebsite.entities.models.getproductinfo.response;

import lombok.Data;
import java.util.List;

import com.santsg.bookingwebsite.entities.models.getproductinfo.response.address.Address;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.Board;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.City;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.Country;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.Description;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.Geolocation;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.GiataInfo;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.HotelCategory;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.Location;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.PaymentPlanInfo;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.Room;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.Theme;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.seosans.Season;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.Town;

@Data
public class Hotel {

    private Address address;
    private String code;

    private City city;
    private Country country;
    private Town town;
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
    private List<Room> rooms;
    private List<Board> boards;
    private List<PaymentPlanInfo> paymentPlanInfo;
    private String originalName;

}