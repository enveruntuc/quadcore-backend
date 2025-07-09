package com.santsg.bookingwebsite.entities.models.autocomplete;

import lombok.Data;

@Data
public class ArrivalAutoCompleteItem {
    private int type;
    private Geolocation geolocation;
    private Country country;
    private State state;
    private City city;
    private Hotel hotel;
    private int provider;
    private GiataInfo giataInfo;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Geolocation getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(Geolocation geolocation) {
        this.geolocation = geolocation;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getProvider() {
        return provider;
    }

    public void setProvider(int provider) {
        this.provider = provider;
    }

    public GiataInfo getGiataInfo() {
        return giataInfo;
    }

    public void setGiataInfo(GiataInfo giataInfo) {
        this.giataInfo = giataInfo;
    }

}
