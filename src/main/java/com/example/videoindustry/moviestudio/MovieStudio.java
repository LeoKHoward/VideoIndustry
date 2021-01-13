package com.example.videoindustry.moviestudio;

import com.example.videoindustry.Company;
import com.example.videoindustry.currencyconverter.CurrencyType;


public class MovieStudio extends Company {

    public MovieStudio() {
        super(CurrencyType.USD);
    }

    public Movie makeMovie(String movieTitle, String movieDirector, int movieReleaseYear, MovieGenre movieGenre,
                           double movieProductionCost, int licensedNumberOfCassettesVideoFactoryAllowedToMake,
                           double licenseFeePerCassetteToVideoFactoryInDollars) {
        expenditure += movieProductionCost;

        return new Movie(movieTitle, movieDirector, movieReleaseYear,
                movieGenre, movieProductionCost, licensedNumberOfCassettesVideoFactoryAllowedToMake,
                licenseFeePerCassetteToVideoFactoryInDollars);

    }

    public void sellMovie(Movie movie, int licensedNumberOfCassettesVideoFactoryAllowedToMake,
                          double licenseFeePerCassetteToVideoFactoryInDollars) {
        movie.setLicensedNumberOfCassettesVideoFactoryAllowedToMake(movie.getLicensedNumberOfCassettesVideoFactoryAllowedToMake());
        revenue += licensedNumberOfCassettesVideoFactoryAllowedToMake * licenseFeePerCassetteToVideoFactoryInDollars;

    }

    public String outputMovieStudioProfitsInLocalCurrency() {
        return "Movie Studio profits in Dollars: $" + getProfits();
    }


}
