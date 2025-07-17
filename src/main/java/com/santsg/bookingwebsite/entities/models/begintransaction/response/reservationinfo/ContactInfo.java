package com.santsg.bookingwebsite.entities.models.begintransaction.response.reservationinfo;

import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.Country;
import com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels.City;

import lombok.Data;

@Data
public class ContactInfo {
    private Country country;
    private City city;

}
