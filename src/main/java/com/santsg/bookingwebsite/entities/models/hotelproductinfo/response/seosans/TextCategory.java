package com.santsg.bookingwebsite.entities.models.hotelproductinfo.response.seosans;

import lombok.Data;
import java.util.List;

@Data
public class TextCategory {
    private String name;
    private List<Presentation> presentations;
}