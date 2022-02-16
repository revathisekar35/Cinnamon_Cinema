package com.techreturners.cc.model;


public class Movie {
	int id;
	String name;
	int totalNoOfSeats;
	Theatre theatre;

	public Movie(int id, String name, int totalNoOfTickets, Theatre theatre) {
		this.id = id;
		this.name = name;
		this.totalNoOfSeats = totalNoOfTickets;
		this.theatre = theatre;
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

	public int getTotalNoOfSeats() {
		return totalNoOfSeats;
	}

	public void setTotalNoOfSeats(int totalNoOfSeats) {
		this.totalNoOfSeats = totalNoOfSeats;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

}
