package com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

import java.util.List;

@Data
public class Offers {
    private int night;
    private boolean isAvailable;
    private int availability;
    private boolean availabilityChecked;
    private List<Rooms> rooms;
    @JsonProperty("isRefundable")
    private boolean isRefundable;
    private List<CancellationPolicies> cancellationPolicies;
    private boolean thirdPartyOwnOffer;
    private List<Object> restrictions;
    private List<Object> warnings;
    @JsonProperty("isChannelManager")
    private boolean isChannelManager;
    private String expiresOn;
    private String offerId;
    private String checkIn;
    private Price price;
    private boolean ownOffer;
    private int provider;
    private Supplier supplier;

    

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean isRefundable() {
        return isRefundable;
    }

    public void setRefundable(boolean refundable) {
        isRefundable = refundable;
    }

    public int getNight() {
        return night;
    }

    public void setNight(int night) {
        this.night = night;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public boolean isAvailabilityChecked() {
        return availabilityChecked;
    }

    public void setAvailabilityChecked(boolean availabilityChecked) {
        this.availabilityChecked = availabilityChecked;
    }

    public List<Rooms> getRooms() {
        return rooms;
    }

    public void setRooms(List<Rooms> rooms) {
        this.rooms = rooms;
    }

    public List<CancellationPolicies> getCancellationPolicies() {
        return cancellationPolicies;
    }

    public void setCancellationPolicies(List<CancellationPolicies> cancellationPolicies) {
        this.cancellationPolicies = cancellationPolicies;
    }

    public boolean isThirdPartyOwnOffer() {
        return thirdPartyOwnOffer;
    }

    public void setThirdPartyOwnOffer(boolean thirdPartyOwnOffer) {
        this.thirdPartyOwnOffer = thirdPartyOwnOffer;
    }

    public List<Object> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<Object> restrictions) {
        this.restrictions = restrictions;
    }

    public List<Object> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<Object> warnings) {
        this.warnings = warnings;
    }

    public String getExpiresOn() {
        return expiresOn;
    }

    public void setExpiresOn(String expiresOn) {
        this.expiresOn = expiresOn;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
    @Data
    public static class Supplier{
        private String name;
    }

    
}
