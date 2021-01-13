package com.example.videoindustry.videofactory;

import com.example.videoindustry.Company;
import com.example.videoindustry.currencyconverter.CurrencyConverter;
import com.example.videoindustry.currencyconverter.CurrencyType;
import com.example.videoindustry.currencyconverter.Money;

public class VideoFactory extends Company {

    private static final double PRODUCTION_COST_PER_CASSETTE_IN_YUAN = 0.50;

    public VideoFactory() {
        super(CurrencyType.CNY);
    }

    public void makeVideoCassettes(Money royaltyPerCassette,
                                   int numberOfCassettesToMake) {

        CurrencyConverter costConverter = new CurrencyConverter(companyCurrencyType);


        double exchangeRate = costConverter.getExchangeRate(royaltyPerCassette.getCurrencyOfTheMoney());

        expenditure += (exchangeRate * royaltyPerCassette.getAmountOfMoney() * numberOfCassettesToMake);
        expenditure += numberOfCassettesToMake * PRODUCTION_COST_PER_CASSETTE_IN_YUAN;

    }

    public void sellVideoCassettes(Money chargeToVideoStorePerVideoCassette, int numberOfCassettesSold) {

        CurrencyConverter salesConverter = new CurrencyConverter(chargeToVideoStorePerVideoCassette.getCurrencyOfTheMoney());

        double exchangeRate = salesConverter.getExchangeRate(companyCurrencyType);

        revenue += exchangeRate * numberOfCassettesSold * chargeToVideoStorePerVideoCassette.getAmountOfMoney();

    }

    public String outputVideoFactoryProfitsInLocalCurrency() {
        return "Video Factory profits in Yuan: " + Math.round(getProfits() * 100.0) / 100.0;

    }


}
