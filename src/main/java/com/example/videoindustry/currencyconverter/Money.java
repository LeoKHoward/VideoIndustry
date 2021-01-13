package com.example.videoindustry.currencyconverter;

public class Money {

    private double amountOfMoney;
    private CurrencyType currencyOfTheMoney;

    public Money(double amount, CurrencyType currency) {
        amountOfMoney = amount;
        currencyOfTheMoney = currency;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public CurrencyType getCurrencyOfTheMoney() {
        return currencyOfTheMoney;
    }

    public void setCurrencyOfTheMoney(CurrencyType currencyOfTheMoney) {
        this.currencyOfTheMoney = currencyOfTheMoney;
    }

}
