package com.linkedListDemo.assignment;

import java.util.List;

public interface MovieInfo {

	
    void addMovie(Movie movie);
    void updateMovie(int movieId, String newRating);
    void deleteMovie(int movieId);
    Movie searchMovie(int movieId);
    List<Movie> showMovies();
    List<Movie> sortMovieRating();
}
