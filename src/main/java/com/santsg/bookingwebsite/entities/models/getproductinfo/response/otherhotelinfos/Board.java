package com.santsg.bookingwebsite.entities.models.getproductinfo.response.otherhotelinfos;

import java.util.List;

import com.santsg.bookingwebsite.entities.models.getproductinfo.response.seosans.MediaFile;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.seosans.Presentation;

import lombok.Data;

@Data
public class Board {
    private List<Presentation> presentations;
    private List<MediaFile> mediaFiles;
    private String name;
    private String code;

}
