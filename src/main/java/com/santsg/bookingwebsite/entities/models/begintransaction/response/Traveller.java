package com.santsg.bookingwebsite.entities.models.begintransaction.response;

import java.util.List;
import java.util.Map;

import com.santsg.bookingwebsite.entities.models.begintransaction.response.BeginTransactionResponse.*;
import lombok.Data;

@Data
public class Traveller {
    private String travellerId;
    private int type;
    private int title;
    private List<Title> availableTitles;
    private List<Title> availableAcademicTitles;
    private String name;
    private String surname;
    private Boolean isLeader;
    private String birthDate;
    private int age;
    private Nationality nationality;
    private String identityNumber;
    private PassportInfo passportInfo;
    private Address address;
    private Object destinationAddress;
    private List<Service> services;
    private int orderNumber;
    private String birthDateFrom;
    private String birthDateTo;
    private List<String> requiredFields;
    private List<Object> documents;
    private int passengerType;
    private Map<String, Object> additionalFields;
    private List<Object> insertFields;
    private int status;
    private int gender;
}
