package com.santsg.bookingwebsite.entities.models.hotelproductinfo.seosans;

import lombok.Data;
import java.util.List;

@Data
public class Season {
    private String name;
    private List<TextCategory> textCategories;
    private List<FacilityCategory> facilityCategories;
    private List<MediaFile> mediaFiles;
}