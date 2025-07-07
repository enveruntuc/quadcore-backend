package com.santsg.bookingwebsite.entities.models.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    private String Agency;
    private String User;
    private String Password;

    

    public String getAgency() {
        return Agency;
    }

    public void setAgency(String agency) {
        this.Agency = agency;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        this.User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}

    

