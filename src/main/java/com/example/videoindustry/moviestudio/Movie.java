package com.example.videoindustry.moviestudio;


public class Movie {

    private String movieTitle;
    private String movieDirector;
    private int movieReleaseYear;
    private MovieGenre movieGenre;
    private double movieProductionCost;
    private int licensedNumberOfCassettesVideoFactoryAllowedToMake;
    private double licenseFeePerCassetteToVideoFactoryInDollars;

    public Movie(String movieTitle, String movieDirector, int movieReleaseYear, MovieGenre movieGenre,
                 double movieProductionCost, int licensedNumberOfCassettesVideoFactoryAllowedToMake,
                 double licenseFeePerCassetteToVideoFactoryInDollars) {
        this.movieTitle = movieTitle;
        this.movieDirector = movieDirector;
        this.movieReleaseYear = movieReleaseYear;
        this.movieGenre = movieGenre;
        this.movieProductionCost = movieProductionCost;
        this.licensedNumberOfCassettesVideoFactoryAllowedToMake = licensedNumberOfCassettesVideoFactoryAllowedToMake;
        this.licenseFeePerCassetteToVideoFactoryInDollars = licenseFeePerCassetteToVideoFactoryInDollars;

    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public int getMovieReleaseYear() {
        return movieReleaseYear;
    }

    public void setMovieReleaseYear(int movieReleaseYear) {
        this.movieReleaseYear = movieReleaseYear;
    }

    public MovieGenre getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(MovieGenre movieGenre) {
        this.movieGenre = movieGenre;
    }

    public double getMovieProductionCost() {
        return movieProductionCost;
    }

    public void setMovieProductionCost(double movieProductionCost) {
        this.movieProductionCost = movieProductionCost;
    }

    public int getLicensedNumberOfCassettesVideoFactoryAllowedToMake() {
        return licensedNumberOfCassettesVideoFactoryAllowedToMake;
    }

    public void setLicensedNumberOfCassettesVideoFactoryAllowedToMake(int licensedNumberOfCassettesVideoFactoryAllowedToMake) {
        this.licensedNumberOfCassettesVideoFactoryAllowedToMake = licensedNumberOfCassettesVideoFactoryAllowedToMake;
    }

    public double getLicenseFeePerCassetteToVideoFactoryInDollars() {
        return licenseFeePerCassetteToVideoFactoryInDollars;
    }

    public void setLicenseFeePerCassetteToVideoFactoryInDollars(double licenseFeePerCassetteToVideoFactoryInDollars) {
        this.licenseFeePerCassetteToVideoFactoryInDollars = licenseFeePerCassetteToVideoFactoryInDollars;
    }


}

