package com.santsg.bookingwebsite.entities.models.getproductinfo.response.seosans;

import lombok.Data;
import java.util.List;

@Data
public class TextCategory {
    private String code;
    private String name;
    private List<Presentation> presentations;
}