package com.santsg.bookingwebsite.entities.models.login;

public class Operator {
    private String code;
    private String name;
    private String thumbnail;
    private boolean agencyCanDiscountCommission;

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getThumbnail() { return thumbnail; }
    public void setThumbnail(String thumbnail) { this.thumbnail = thumbnail; }
    public boolean isAgencyCanDiscountCommission() { return agencyCanDiscountCommission; }
    public void setAgencyCanDiscountCommission(boolean agencyCanDiscountCommission) { this.agencyCanDiscountCommission = agencyCanDiscountCommission; }
} 