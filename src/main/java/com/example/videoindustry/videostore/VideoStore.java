package com.example.videoindustry.videostore;

import com.example.videoindustry.Company;
import com.example.videoindustry.currencyconverter.CurrencyConverter;
import com.example.videoindustry.currencyconverter.CurrencyType;
import com.example.videoindustry.currencyconverter.Money;


public class VideoStore extends Company {

    private static final double ANNUAL_VIDEO_STORE_RUNNING_COST_IN_GBP = 1000;


    public VideoStore() {
        super(CurrencyType.GBP);
        this.expenditure += ANNUAL_VIDEO_STORE_RUNNING_COST_IN_GBP;
    }


    public void buyVideoCassette(Money costPerVideoCassetteFromVideoFactory,
                                 int videoCassetteCopiesBoughtFromVideoFactory) {

        CurrencyConverter costConverter = new CurrencyConverter(companyCurrencyType);

        double exchangeRate = costConverter.getExchangeRate(costPerVideoCassetteFromVideoFactory.getCurrencyOfTheMoney());

        expenditure += (exchangeRate * costPerVideoCassetteFromVideoFactory.getAmountOfMoney()
                * videoCassetteCopiesBoughtFromVideoFactory);
        expenditure += ANNUAL_VIDEO_STORE_RUNNING_COST_IN_GBP;

    }

    public void sellVideoToCustomer(Money chargeToCustomerPerVideoCassetteCopy, int videosSoldToCustomersPerFilm) {

        CurrencyConverter salesConverter = new CurrencyConverter(chargeToCustomerPerVideoCassetteCopy.getCurrencyOfTheMoney());

        double exchangeRate = salesConverter.getExchangeRate(companyCurrencyType);

        revenue += exchangeRate * videosSoldToCustomersPerFilm * chargeToCustomerPerVideoCassetteCopy.getAmountOfMoney();


    }

    public String outputVideoStoreProfitsInLocalCurrency() {
        return "Video Store profits in Euros: €" + getProfits();
    }


}
