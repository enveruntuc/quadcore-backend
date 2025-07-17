package com.santsg.bookingwebsite.entities.models.setreservationinfo.request;

import lombok.Data;

@Data
public class CustomerInfo {
    private boolean isCompany;
    private PassportInfo passportInfo;
    private Address address;
    private TaxInfo taxInfo;
    private int title;
    private String name;
    private String surname;
    private String birthDate;
    private String identityNumber;
}