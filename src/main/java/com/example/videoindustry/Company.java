package com.example.videoindustry;

import com.example.videoindustry.currencyconverter.CurrencyType;

public abstract class Company {

    protected double expenditure;
    protected double revenue;
    protected CurrencyType companyCurrencyType;

    public Company(CurrencyType companyCurrencyType) {
        this.companyCurrencyType = companyCurrencyType;

    }


    public double getProfits() {
        return revenue - expenditure;
    }

    private String getProfitability() {
        if (revenue - expenditure > 0) {
            return "PROFITABLE";
        } else {
            return "NOT PROFITABLE";
        }
    }

    public String outputProfitMessage() {
        return String.format("This company was %s", getProfitability());
    }


    public double getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(double expenditure) {
        this.expenditure = expenditure;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }


}
