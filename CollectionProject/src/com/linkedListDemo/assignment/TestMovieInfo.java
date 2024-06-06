package com.linkedListDemo.assignment;

import java.util.List;

public class TestMovieInfo {
	
	    public static void main(String[] args) {
	        MovieManager movieManager = new MovieManager();

	 
	        movieManager.addMovie(new Movie(1, "Inception", "9.0", new Character(101, "Cobb", "Dream thief")));
	        movieManager.addMovie(new Movie(2, "The Dark Knight", "8.8", new Character(102, "Batman", "Gotham's protector")));

	        // Update movie rating
	        movieManager.updateMovie(1, "9.2");

	        // Delete a movie
	        movieManager.deleteMovie(2);

	        // Search for a movie
	        Movie searchedMovie = movieManager.searchMovie(1);
	        System.out.println("Searched Movie: " + searchedMovie);

	        // Show all movies
	        List<Movie> allMovies = movieManager.showMovies();
	        System.out.println("All Movies:");
	        for (Movie movie : allMovies) {
	            System.out.println(movie);
	        }

	        // Sort movies by rating
	        List<Movie> sortedMovies = movieManager.sortMovieRating();
	        System.out.println("Sorted Movies by Rating:");
	        for (Movie movie : sortedMovies) {
	            System.out.println(movie);
	        }
	    }
	}
