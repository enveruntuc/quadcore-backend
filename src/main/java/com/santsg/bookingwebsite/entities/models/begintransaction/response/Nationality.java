package com.santsg.bookingwebsite.entities.models.begintransaction.response;

import lombok.Data;

@Data
public class Nationality {
    private String twoLetterCode;
    private String threeLetterCode;
    private String numericCode;
    private String isdCode;
    private String name;

}
