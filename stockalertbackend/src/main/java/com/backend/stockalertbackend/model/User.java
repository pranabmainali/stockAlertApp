package com.backend.stockalertbackend.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String username;
    private String password;
    private int phoneNumber;
    private List<Alert> alertList;

    public User(int id, String username, String password, int phoneNumber){
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        alertList = new ArrayList<Alert>();

    }

    public List<Alert> getAlertList() {
        return this.alertList;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addAlert(Alert alert) {
        this.alertList.add(alert);
    }

    public void removeAlert(Alert alert){
        this.alertList.remove(alert);
    }

    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
