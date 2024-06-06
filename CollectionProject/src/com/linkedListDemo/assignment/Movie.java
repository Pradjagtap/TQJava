package com.linkedListDemo.assignment;

public class Movie {
	private int movieId;
	private String movieName;
	private String movieRating;
	private Character c;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int movieId, String movieName, String movieRating, Character c) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieRating = movieRating;
		this.c = c;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}
	public Character getC() {
		return c;
	}
	public void setC(Character c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieRating=" + movieRating + ", c=" + c
				+ "]";
	}
	
	

}
