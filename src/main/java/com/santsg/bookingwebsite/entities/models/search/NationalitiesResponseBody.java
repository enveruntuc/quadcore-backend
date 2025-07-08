package com.santsg.bookingwebsite.entities.models.search;

import java.util.List;

public class NationalitiesResponseBody {
    private List<Nationality> nationalities;
    private String defaultNationality;

    public NationalitiesResponseBody() {}

    public List<Nationality> getNationalities() {
        return nationalities;
    }

    public void setNationalities(List<Nationality> nationalities) {
        this.nationalities = nationalities;
    }

    public String getDefaultNationality() {
        return defaultNationality;
    }

    public void setDefaultNationality(String defaultNationality) {
        this.defaultNationality = defaultNationality;
    }
} 