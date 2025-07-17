package com.santsg.bookingwebsite.entities.models.begintransaction.response.reservationinfo;

import java.util.List;

import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.City;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.Country;
import lombok.Data;

@Data
public class AgencyAddress {
    private Country country;
    private City city;
    private List<String> addressLines;
    private String zipCode;
    private String email;
    private String phone;
    private String address;

}
