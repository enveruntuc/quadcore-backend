package com.santsg.bookingwebsite.entities.models.getofferdetails.response;
import lombok.Data;
import java.util.List;

import com.santsg.bookingwebsite.entities.models.getofferdetails.response.offerdetails.OfferDetails;

@Data
public class OfferDetailsResponseBody {
    private List<OfferDetails> offerDetails;
}