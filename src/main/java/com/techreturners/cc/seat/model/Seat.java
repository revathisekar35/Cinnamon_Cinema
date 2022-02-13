package com.techreturners.cc.seat.model;

import com.techreturners.cc.movie.model.Movie;

public class Seat {
	int id;
	String seatNumber;
	char row;
	Movie movie;
	boolean isBooked = false;

	public Seat(int id, String seatNumber, char row, Movie movie) {
		this.id = id;
		this.seatNumber = seatNumber;
		this.row = row;
		this.movie = movie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public char getRow() {
		return row;
	}

	public void setRow(char row) {
		this.row = row;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

}
