package com.santsg.bookingwebsite.entities.models.setreservationinfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CustomerInfo {
    @JsonProperty("isCompany")
    private boolean isCompany;
    private PassportInfo passportInfo;
    private Address address;
    private TaxInfo taxInfo;
    private int title;
    private String name;
    private String surname;
    private String birthDate;
    private String identityNumber;
    private boolean updateIfExists;
    private boolean updateOnlyNullFields;
    @JsonProperty("isDefault")
    private boolean isDefault;
    private String id;
}