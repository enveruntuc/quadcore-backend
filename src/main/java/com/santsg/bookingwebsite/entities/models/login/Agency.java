package com.santsg.bookingwebsite.entities.models.login;

public class Agency {
    private String id;
    private String code;
    private String name;
    private String registerCode;
    private String firmName;
    private String licenseNo;
    private boolean ownAgency;
    private int paymentFrom;
    private boolean useOwnWebSettings;
    private boolean sendFlightInfoSms;
    private int allowUnpaidRes;
    private boolean aceExport;
    private String nationality;
    private boolean allowNon3DPayments;
    private String webSetGrp;
    private boolean bonusUseSysParam;
    private boolean bonusUserSeeAgencyW;
    private boolean bonusUserSeeOwnW;
    private boolean allowAddCredit;
    private boolean showAgencyLogoOnB2b;
    private boolean hideInstallmentTable;
    private boolean hideAgencyCreditOnWeb;
    private boolean force2FactorAuth;
    private int authType;
    private int location;

    // Getter ve setter'lar
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRegisterCode() { return registerCode; }
    public void setRegisterCode(String registerCode) { this.registerCode = registerCode; }
    public String getFirmName() { return firmName; }
    public void setFirmName(String firmName) { this.firmName = firmName; }
    public String getLicenseNo() { return licenseNo; }
    public void setLicenseNo(String licenseNo) { this.licenseNo = licenseNo; }
    public boolean isOwnAgency() { return ownAgency; }
    public void setOwnAgency(boolean ownAgency) { this.ownAgency = ownAgency; }
    public int getPaymentFrom() { return paymentFrom; }
    public void setPaymentFrom(int paymentFrom) { this.paymentFrom = paymentFrom; }
    public boolean isUseOwnWebSettings() { return useOwnWebSettings; }
    public void setUseOwnWebSettings(boolean useOwnWebSettings) { this.useOwnWebSettings = useOwnWebSettings; }
    public boolean isSendFlightInfoSms() { return sendFlightInfoSms; }
    public void setSendFlightInfoSms(boolean sendFlightInfoSms) { this.sendFlightInfoSms = sendFlightInfoSms; }
    public int getAllowUnpaidRes() { return allowUnpaidRes; }
    public void setAllowUnpaidRes(int allowUnpaidRes) { this.allowUnpaidRes = allowUnpaidRes; }
    public boolean isAceExport() { return aceExport; }
    public void setAceExport(boolean aceExport) { this.aceExport = aceExport; }
    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }
    public boolean isAllowNon3DPayments() { return allowNon3DPayments; }
    public void setAllowNon3DPayments(boolean allowNon3DPayments) { this.allowNon3DPayments = allowNon3DPayments; }
    public String getWebSetGrp() { return webSetGrp; }
    public void setWebSetGrp(String webSetGrp) { this.webSetGrp = webSetGrp; }
    public boolean isBonusUseSysParam() { return bonusUseSysParam; }
    public void setBonusUseSysParam(boolean bonusUseSysParam) { this.bonusUseSysParam = bonusUseSysParam; }
    public boolean isBonusUserSeeAgencyW() { return bonusUserSeeAgencyW; }
    public void setBonusUserSeeAgencyW(boolean bonusUserSeeAgencyW) { this.bonusUserSeeAgencyW = bonusUserSeeAgencyW; }
    public boolean isBonusUserSeeOwnW() { return bonusUserSeeOwnW; }
    public void setBonusUserSeeOwnW(boolean bonusUserSeeOwnW) { this.bonusUserSeeOwnW = bonusUserSeeOwnW; }
    public boolean isAllowAddCredit() { return allowAddCredit; }
    public void setAllowAddCredit(boolean allowAddCredit) { this.allowAddCredit = allowAddCredit; }
    public boolean isShowAgencyLogoOnB2b() { return showAgencyLogoOnB2b; }
    public void setShowAgencyLogoOnB2b(boolean showAgencyLogoOnB2b) { this.showAgencyLogoOnB2b = showAgencyLogoOnB2b; }
    public boolean isHideInstallmentTable() { return hideInstallmentTable; }
    public void setHideInstallmentTable(boolean hideInstallmentTable) { this.hideInstallmentTable = hideInstallmentTable; }
    public boolean isHideAgencyCreditOnWeb() { return hideAgencyCreditOnWeb; }
    public void setHideAgencyCreditOnWeb(boolean hideAgencyCreditOnWeb) { this.hideAgencyCreditOnWeb = hideAgencyCreditOnWeb; }
    public boolean isForce2FactorAuth() { return force2FactorAuth; }
    public void setForce2FactorAuth(boolean force2FactorAuth) { this.force2FactorAuth = force2FactorAuth; }
    public int getAuthType() { return authType; }
    public void setAuthType(int authType) { this.authType = authType; }
    public int getLocation() { return location; }
    public void setLocation(int location) { this.location = location; }
} 