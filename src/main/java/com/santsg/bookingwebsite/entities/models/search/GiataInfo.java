package com.santsg.bookingwebsite.entities.models.search;

import lombok.Data;

@Data
public class GiataInfo {
    private String hotelId;
    private String destinationId;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }
}