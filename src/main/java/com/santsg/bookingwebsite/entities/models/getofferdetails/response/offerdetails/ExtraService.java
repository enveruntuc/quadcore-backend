package com.santsg.bookingwebsite.entities.models.getofferdetails.response.offerdetails;

import lombok.Data;
import java.util.List;

import com.santsg.bookingwebsite.entities.models.getofferdetails.response.Offers;

@Data
public class ExtraService {
    private String name;
    private String id;
    private String code;
    private Boolean compulsory;
    private Boolean free;
    private List<Offers> offers;

}
