package com.santsg.bookingwebsite.entities.models.setreservationinfo.request;

import lombok.Data;

@Data
public class PassportInfo {
    private String serial;
    private String number;
    private String expireDate;
    private String issueDate;
    private String citizenshipCountryCode;
}
