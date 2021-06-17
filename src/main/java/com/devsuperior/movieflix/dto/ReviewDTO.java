package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.User;

public class ReviewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Movie movieId;
	private User userId;	
	private String text;
	
	public ReviewDTO() {
	}

	public ReviewDTO(Long id, Movie movieId, User userId, String text) {
		this.id = id;
		this.movieId = movieId;
		this.userId = userId;
		this.text = text;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Movie getMovieId() {
		return movieId;
	}

	public void setMovieId(Movie movieId) {
		this.movieId = movieId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


}
