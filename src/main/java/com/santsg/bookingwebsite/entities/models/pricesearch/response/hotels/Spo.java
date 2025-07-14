package com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels;

import java.util.List;

import lombok.Data;

@Data
public class Spo {
    private Price price;
    private List<Item> items;
}
