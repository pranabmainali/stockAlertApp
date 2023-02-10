package com.backend.stockalertbackend.model;

public class Stock {
    
    private String tickerSymbol;

    public Stock(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }


    public String getTickerSymbol() {
        return this.tickerSymbol;
    }


}