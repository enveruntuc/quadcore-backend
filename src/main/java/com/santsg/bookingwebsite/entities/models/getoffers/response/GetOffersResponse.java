package com.santsg.bookingwebsite.entities.models.getoffers.response;
import java.util.List;

import lombok.Data;

@Data
public class GetOffersResponse {
  
    private List<Offers> offers;
    private Information information;
    private int productId;
}
