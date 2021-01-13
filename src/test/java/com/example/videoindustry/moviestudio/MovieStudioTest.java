package com.example.videoindustry.moviestudio;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class MovieStudioTest {


    @Test
    void testCalculateMovieStudioProfits() {

        MovieStudio testMovieStudio = new MovieStudio();

        Movie testMovie = testMovieStudio.makeMovie("Frozen", "Mickey Mouse", 2010,
                MovieGenre.ANIMATED, 2000, 1500,
                3.0);

        testMovieStudio.sellMovie(testMovie, 1500,
                3.0);

        String expectedOutput = "Movie Studio profits in Dollars: $2500.0";

        assertThat(expectedOutput).isEqualTo(testMovieStudio.outputMovieStudioProfitsInLocalCurrency());

        assertThat(testMovieStudio.getRevenue()).isEqualTo(4500.0);

        assertThat(testMovieStudio.getExpenditure()).isEqualTo(2000);

        assertThat(testMovieStudio.getProfits()).isEqualTo(2500.0);


    }


    @Test
    void testAssertIfMovieStudioIsProfitable() {

        MovieStudio testMovieStudio = new MovieStudio();

        Movie testMovie = testMovieStudio.makeMovie("Frozen", "Mickey Mouse", 2010,
                MovieGenre.ANIMATED, 2000, 1500,
                3.0);

        testMovieStudio.sellMovie(testMovie, 1500,
                3.0);

        String expectedOutput = "This company was PROFITABLE";

        assertThat(testMovieStudio.outputProfitMessage()).isEqualTo(expectedOutput);


    }
}