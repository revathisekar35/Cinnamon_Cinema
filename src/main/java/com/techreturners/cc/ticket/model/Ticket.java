package com.techreturners.cc.ticket.model;

import java.util.List;

import com.techreturners.cc.seat.model.Seat;

public class Ticket {
	int id;
	int movieId;
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
