package com.example.videoindustry.videofactory;

import com.example.videoindustry.currencyconverter.CurrencyType;
import com.example.videoindustry.currencyconverter.Money;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VideoFactoryTest {

    @Test
    void testCalculateVideoFactoryProfits() {
        VideoFactory testVideoFactory = new VideoFactory();

        testVideoFactory.makeVideoCassettes(new Money(3.0, CurrencyType.USD), 1500);
//        $4500 = 29385 Yuan

        testVideoFactory.sellVideoCassettes(new Money(10.99, CurrencyType.GBP), 1000);
//        £10990 = 95722.9 Yuan

//      Expenditure = 29385

        String expectedOutput = "Video Factory profits in Yuan: 66336.9";

        assertThat(expectedOutput).isEqualTo(testVideoFactory.outputVideoFactoryProfitsInLocalCurrency());

        assertThat(Math.round(testVideoFactory.getRevenue() * 100.0) / 100.0).isEqualTo(95722.9);

        assertThat(Math.round(testVideoFactory.getExpenditure() * 100.0) / 100.0).isEqualTo(1425.0);

        assertThat(Math.round(testVideoFactory.getProfits() * 100.0) / 100.0).isEqualTo(2000);

    }

    @Test
    void testAssertIfVideoFactoryIsProfitable() {
    }

    @Test
    void outputVideoFactoryProfitsInLocalCurrency() {
    }
}