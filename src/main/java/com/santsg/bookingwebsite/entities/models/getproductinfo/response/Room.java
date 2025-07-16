package com.santsg.bookingwebsite.entities.models.getproductinfo.response;

import java.util.List;

import com.santsg.bookingwebsite.entities.models.getproductinfo.response.seosans.Facility;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.seosans.MediaFile;
import com.santsg.bookingwebsite.entities.models.getproductinfo.response.seosans.Presentation;

import lombok.Data;

@Data
public class Room {
    private List<Presentation> presentations;
    private List<Facility> facilities;
    private List<MediaFile> mediaFiles;
    private String name;
    private String code;
}
