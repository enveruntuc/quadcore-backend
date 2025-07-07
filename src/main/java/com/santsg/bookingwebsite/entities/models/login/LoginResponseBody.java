package com.santsg.bookingwebsite.entities.models.login;

public class LoginResponseBody {
    private String token;
    private String expiresOn;
    private long tokenId;
    private UserInfo userInfo;
    private boolean loggedInWithMasterKey;

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    public String getExpiresOn() { return expiresOn; }
    public void setExpiresOn(String expiresOn) { this.expiresOn = expiresOn; }

    public long getTokenId() { return tokenId; }
    public void setTokenId(long tokenId) { this.tokenId = tokenId; }

    public UserInfo getUserInfo() { return userInfo; }
    public void setUserInfo(UserInfo userInfo) { this.userInfo = userInfo; }

    public boolean isLoggedInWithMasterKey() { return loggedInWithMasterKey; }
    public void setLoggedInWithMasterKey(boolean loggedInWithMasterKey) { this.loggedInWithMasterKey = loggedInWithMasterKey; }
} 