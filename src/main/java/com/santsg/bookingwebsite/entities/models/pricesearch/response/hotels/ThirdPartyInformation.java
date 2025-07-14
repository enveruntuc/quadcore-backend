package com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels;

import java.util.List;

import lombok.Data;

@Data
public class ThirdPartyInformation {
    private List<Infos> infos;

}

@Data
class Infos {
    private String key;
    private String value;
}