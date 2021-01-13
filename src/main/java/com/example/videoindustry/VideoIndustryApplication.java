package com.example.videoindustry;

import com.example.videoindustry.currencyconverter.CurrencyType;
import com.example.videoindustry.currencyconverter.Money;
import com.example.videoindustry.moviestudio.Movie;
import com.example.videoindustry.moviestudio.MovieGenre;
import com.example.videoindustry.moviestudio.MovieStudio;
import com.example.videoindustry.videofactory.VideoFactory;
import com.example.videoindustry.videostore.VideoStore;


public class VideoIndustryApplication {

    public static void main(String[] args) {


        MovieStudio disney = new MovieStudio();


        Movie actionMovie = disney.makeMovie("Terminator", "James Cameron", 1984,
                MovieGenre.ACTION, 1000, 1000,
                2.0);

        disney.sellMovie(actionMovie, 1000, 2.0);

        System.out.println(disney.outputMovieStudioProfitsInLocalCurrency());

        System.out.println("Movie Studio: " + disney.outputProfitMessage());

        System.out.println("\n");



        VideoFactory disneyVideoFactory = new VideoFactory();

        disneyVideoFactory.makeVideoCassettes(new Money(2.0, CurrencyType.USD), 600);

        disneyVideoFactory.sellVideoCassettes(new Money(8.99, CurrencyType.GBP), 300);

        System.out.println(disneyVideoFactory.outputVideoFactoryProfitsInLocalCurrency());

        System.out.println("Video Factory: " + disneyVideoFactory.outputProfitMessage());

        System.out.println("\n");



        VideoStore disneyVideoStore = new VideoStore();

        disneyVideoStore.buyVideoCassette(new Money(8.99, CurrencyType.GBP), 300);

        disneyVideoStore.sellVideoToCustomer(new Money(15.99, CurrencyType.EUR), 350);

        System.out.println(disneyVideoStore.outputVideoStoreProfitsInLocalCurrency());

        System.out.println("Video Store: " + disneyVideoStore.outputProfitMessage());


    }

}
