package com.santsg.bookingwebsite.entities.models.pricesearch;

import lombok.Data;

@Data
public class PriceSearchRequest {

    private RequestStaticEntities requestStaticEntities;
    private ArrivalLocations arrivalLocations;
    private RoomCriteria roomCriteria;
    private CustomerInformations customerInformations;

}
