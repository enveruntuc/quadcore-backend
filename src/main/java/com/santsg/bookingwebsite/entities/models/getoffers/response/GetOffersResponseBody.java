package com.santsg.bookingwebsite.entities.models.getoffers.response;

import java.util.List;

import com.santsg.bookingwebsite.entities.models.getproductinfo.response.Room;

import lombok.Data;

@Data
public class GetOffersResponseBody {

    private List<Offers> offers;
    private Information information;
    private String productId;
    private List<Room> roomInfos;

}
