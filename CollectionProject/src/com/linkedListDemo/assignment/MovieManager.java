package com.linkedListDemo.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public	class MovieManager implements MovieInfo {
	    private List<Movie> movieList;

	    public MovieManager() {
	        movieList = new ArrayList<>();
	    }

	    @Override
	    public void addMovie(Movie movie) {
	        movieList.add(movie);
	    }

	    @Override
	    public void updateMovie(int movieId, String newRating) {
	        for (Movie movie : movieList) {
	            if (movie.getMovieId() == movieId) {
	                movie.setMovieRating(newRating);
	                break;
	            }
	        }
	    }

	    @Override
	    public void deleteMovie(int movieId) {
	        movieList.removeIf(movie -> movie.getMovieId() == movieId);
	    }

	    @Override
	    public Movie searchMovie(int movieId) {
	        for (Movie movie : movieList) {
	            if (movie.getMovieId() == movieId) {
	                return movie;
	            }
	        }
	        return null;
	    }

	    @Override
	    public List<Movie> showMovies() {
	        return movieList;
	    }

	    @Override
	    public List<Movie> sortMovieRating() {
	        Collections.sort(movieList, Comparator.comparing(Movie::getMovieRating).reversed());
	        return movieList;
	    }
	}

