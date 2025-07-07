package com.santsg.bookingwebsite.entities.models.login;

public class UserInfo {
    private MainAgency mainAgency;
    private Agency agency;
    private Office office;
    private Operator operator;
    private Market market;
    private int webSiteId;
    private int marketWebSiteId;
    private boolean allowChangePassword;
    private boolean allowCreateNewUser;
    private boolean allowCreateAgency;
    private boolean allowMakeReservation;
    private boolean allowEditReservation;
    private boolean allowCancelReservation;
    private boolean allowB2BUpdate;
    private String mobile;
    private String email;
    private String passwordChangedDate;
    private boolean allowApiAccess;
    private String lastAccessDate;
    private boolean zohoTicketUpdate;
    private boolean reset2FactorQr;
    private String name;
    private String id;
    private String code;

    // Getter ve setter'lar
    public MainAgency getMainAgency() { return mainAgency; }
    public void setMainAgency(MainAgency mainAgency) { this.mainAgency = mainAgency; }
    public Agency getAgency() { return agency; }
    public void setAgency(Agency agency) { this.agency = agency; }
    public Office getOffice() { return office; }
    public void setOffice(Office office) { this.office = office; }
    public Operator getOperator() { return operator; }
    public void setOperator(Operator operator) { this.operator = operator; }
    public Market getMarket() { return market; }
    public void setMarket(Market market) { this.market = market; }
    public int getWebSiteId() { return webSiteId; }
    public void setWebSiteId(int webSiteId) { this.webSiteId = webSiteId; }
    public int getMarketWebSiteId() { return marketWebSiteId; }
    public void setMarketWebSiteId(int marketWebSiteId) { this.marketWebSiteId = marketWebSiteId; }
    public boolean isAllowChangePassword() { return allowChangePassword; }
    public void setAllowChangePassword(boolean allowChangePassword) { this.allowChangePassword = allowChangePassword; }
    public boolean isAllowCreateNewUser() { return allowCreateNewUser; }
    public void setAllowCreateNewUser(boolean allowCreateNewUser) { this.allowCreateNewUser = allowCreateNewUser; }
    public boolean isAllowCreateAgency() { return allowCreateAgency; }
    public void setAllowCreateAgency(boolean allowCreateAgency) { this.allowCreateAgency = allowCreateAgency; }
    public boolean isAllowMakeReservation() { return allowMakeReservation; }
    public void setAllowMakeReservation(boolean allowMakeReservation) { this.allowMakeReservation = allowMakeReservation; }
    public boolean isAllowEditReservation() { return allowEditReservation; }
    public void setAllowEditReservation(boolean allowEditReservation) { this.allowEditReservation = allowEditReservation; }
    public boolean isAllowCancelReservation() { return allowCancelReservation; }
    public void setAllowCancelReservation(boolean allowCancelReservation) { this.allowCancelReservation = allowCancelReservation; }
    public boolean isAllowB2BUpdate() { return allowB2BUpdate; }
    public void setAllowB2BUpdate(boolean allowB2BUpdate) { this.allowB2BUpdate = allowB2BUpdate; }
    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPasswordChangedDate() { return passwordChangedDate; }
    public void setPasswordChangedDate(String passwordChangedDate) { this.passwordChangedDate = passwordChangedDate; }
    public boolean isAllowApiAccess() { return allowApiAccess; }
    public void setAllowApiAccess(boolean allowApiAccess) { this.allowApiAccess = allowApiAccess; }
    public String getLastAccessDate() { return lastAccessDate; }
    public void setLastAccessDate(String lastAccessDate) { this.lastAccessDate = lastAccessDate; }
    public boolean isZohoTicketUpdate() { return zohoTicketUpdate; }
    public void setZohoTicketUpdate(boolean zohoTicketUpdate) { this.zohoTicketUpdate = zohoTicketUpdate; }
    public boolean isReset2FactorQr() { return reset2FactorQr; }
    public void setReset2FactorQr(boolean reset2FactorQr) { this.reset2FactorQr = reset2FactorQr; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    // Alt sınıflar ilerleyen adımda eklenecek
} 