package com.santsg.bookingwebsite.entities.models.checkin;

import java.util.List;

import lombok.Data;


@Data
public class CheckInDayRequest {
    
    private int ProductType;
    private boolean IncludeSubLocations;
    private Object  Product;
    private List<ArrivalLocations> ArrivalLocations;
   
}