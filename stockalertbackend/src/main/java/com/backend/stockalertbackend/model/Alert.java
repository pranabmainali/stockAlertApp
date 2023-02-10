package com.backend.stockalertbackend.model;

public class Alert {

    private int alertid;
    private int userid;
    private Stock stock;
    private double targetPrice;

    public Alert(int alertid, int userid, Stock stock, double targetPrice) {
        this.alertid = alertid;
        this.userid = userid;
        this.stock = stock;
        this.targetPrice = targetPrice;
    }
    
}

    public int getAlertid() {
        return this.alertid;
    }

    public void setAlertid(int alertid) {
        this.alertid = alertid;
    }

    public Stock getStock() {
        return this.stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public double getTargetPrice() {
        return this.targetPrice;
    }

    public void setTargetPrice(double targetPrice) {
        this.targetPrice = targetPrice;
    }
