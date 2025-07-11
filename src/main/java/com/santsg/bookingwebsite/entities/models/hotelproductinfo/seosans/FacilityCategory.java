package com.santsg.bookingwebsite.entities.models.hotelproductinfo.seosans;

import lombok.Data;
import java.util.List;

@Data
public class FacilityCategory {
    private String name;
    private List<Facility> facilities;
}