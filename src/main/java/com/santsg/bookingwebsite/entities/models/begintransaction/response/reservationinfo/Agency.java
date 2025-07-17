package com.santsg.bookingwebsite.entities.models.begintransaction.response.reservationinfo;

import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.Country;

import lombok.Data;

@Data
public class Agency {
    private String code;
    private String name;
    private Country country;
    private AgencyAddress address;
    private boolean ownAgency;
    private boolean aceExport;
    private ContactInfo contactInfo;

}
