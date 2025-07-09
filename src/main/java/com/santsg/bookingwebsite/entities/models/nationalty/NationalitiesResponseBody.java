package com.santsg.bookingwebsite.entities.models.nationalty;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NationalitiesResponseBody {
    private List<Nationality> nationalities;
    private String defaultNationality;

    public NationalitiesResponseBody() {
    }

    public List<Nationality> getNationalities() {
        return nationalities;
    }

    public void setNationalities(List<Nationality> nationalities) {
        this.nationalities = nationalities;
    }

    public String getDefaultNationality() {
        return defaultNationality;
    }

    @JsonProperty("default")
    public void setDefaultNationality(String defaultNationality) {
        this.defaultNationality = defaultNationality;
    }

}