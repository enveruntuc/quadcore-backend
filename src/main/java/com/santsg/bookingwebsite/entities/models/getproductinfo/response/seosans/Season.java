package com.santsg.bookingwebsite.entities.models.getproductinfo.response.seosans;

import lombok.Data;
import java.util.List;

import com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos.Theme;

@Data
public class Season {
    private int id;
    private String name;
    private String beginDate;
    private String endDate;
    private List<TextCategory> textCategories;
    private List<FacilityCategory> facilityCategories;
    private List<MediaFile> mediaFiles;
    private List<Theme> themes;
}