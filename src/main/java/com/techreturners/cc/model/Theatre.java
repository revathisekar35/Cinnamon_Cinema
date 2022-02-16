package com.techreturners.cc.model;

import java.util.ArrayList;
import java.util.List;

import com.techreturners.cc.model.Movie;

public class Theatre {
	int id;
	String name;
	List<Movie> movies = new ArrayList<Movie>();

	public Theatre(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

}
