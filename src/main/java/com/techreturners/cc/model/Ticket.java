package com.techreturners.cc.model;

import java.util.List;



public class Ticket {
	private int id;
	private int movieId;
	List<Seat> noOfSeat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public List<Seat> getNoOfSeat() {
		return noOfSeat;
	}

	public void setNoOfSeat(List<Seat> noOfSeat) {
		this.noOfSeat = noOfSeat;
	}

}
