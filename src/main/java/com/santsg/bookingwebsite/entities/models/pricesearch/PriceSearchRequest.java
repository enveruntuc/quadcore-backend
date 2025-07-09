package com.santsg.bookingwebsite.entities.models.pricesearch;

import com.santsg.bookingwebsite.entities.models.pricesearch.hotelinformations.ArrivalLocations;
import com.santsg.bookingwebsite.entities.models.pricesearch.hotelinformations.CustomerInformations;
import com.santsg.bookingwebsite.entities.models.pricesearch.hotelinformations.RoomCriteria;

import lombok.Data;

@Data
public class PriceSearchRequest {

    private RequestStaticEntities requestStaticEntities;
    private ArrivalLocations arrivalLocations;
    private RoomCriteria roomCriteria;
    private CustomerInformations customerInformations;

}
