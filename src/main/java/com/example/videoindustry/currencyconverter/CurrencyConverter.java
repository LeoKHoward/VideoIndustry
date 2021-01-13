package com.example.videoindustry.currencyconverter;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {

    private Map<CurrencyType, Double> exchangeRate = new HashMap<>();


    public CurrencyConverter(CurrencyType targetCurrency) {
        switch (targetCurrency) {
            case USD:
                exchangeRate.put(CurrencyType.USD, 1.00);
                exchangeRate.put(CurrencyType.EUR, 0.83);
                exchangeRate.put(CurrencyType.GBP, 0.75);
                exchangeRate.put(CurrencyType.CNY, 6.53);
                exchangeRate.put(CurrencyType.JPY, 104.07);
                break;
            case EUR:
                exchangeRate.put(CurrencyType.USD, 1.21);
                exchangeRate.put(CurrencyType.EUR, 1.00);
                exchangeRate.put(CurrencyType.GBP, 0.91);
                exchangeRate.put(CurrencyType.CNY, 7.91);
                exchangeRate.put(CurrencyType.JPY, 126.13);
                break;
            case GBP:
                exchangeRate.put(CurrencyType.USD, 1.33);
                exchangeRate.put(CurrencyType.EUR, 1.10);
                exchangeRate.put(CurrencyType.GBP, 1.00);
                exchangeRate.put(CurrencyType.CNY, 8.71);
                exchangeRate.put(CurrencyType.JPY, 138.82);
                break;
            case CNY:
                exchangeRate.put(CurrencyType.USD, 0.15);
                exchangeRate.put(CurrencyType.EUR, 0.13);
                exchangeRate.put(CurrencyType.GBP, 0.11);
                exchangeRate.put(CurrencyType.CNY, 1.00);
                exchangeRate.put(CurrencyType.JPY, 15.94);
                break;
            case JPY:
                exchangeRate.put(CurrencyType.USD, 0.0096);
                exchangeRate.put(CurrencyType.EUR, 0.0079);
                exchangeRate.put(CurrencyType.GBP, 0.0072);
                exchangeRate.put(CurrencyType.CNY, 0.063);
                exchangeRate.put(CurrencyType.JPY, 1.000);
                break;
        }
    }

    public double getExchangeRate(CurrencyType sourceCurrency) {
        return exchangeRate.get(sourceCurrency);

    }


}
