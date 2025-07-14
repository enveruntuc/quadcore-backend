package com.santsg.bookingwebsite.entities.models.getproductinfo.response.seosans;

import lombok.Data;
import java.util.List;

@Data
public class FacilityCategory {
    private String id;
    private String name;
    private List<Facility> facilities;
}