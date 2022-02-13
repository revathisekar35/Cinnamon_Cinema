package com.techreturners.cc.ticket.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.techreturners.cc.movie.model.Movie;
import com.techreturners.cc.seat.model.Seat;
import com.techreturners.cc.theatre.model.Theatre;
import com.techreturners.cc.ticket.service.TicketService;

public class TicketServiceImpl implements TicketService {
	List<Seat> totalSeats = new ArrayList<Seat>();

	public TicketServiceImpl() {
		Theatre theatre = new Theatre(1, "ODIEN");
		Movie movie = new Movie(1, "Boss Baby", 15, theatre);
		totalSeats.add(new Seat(1, "A1", 'A', movie));
		totalSeats.add(new Seat(2, "A2", 'A', movie));
		totalSeats.add(new Seat(3, "A3", 'A', movie));
		totalSeats.add(new Seat(4, "A4", 'A', movie));
		totalSeats.add(new Seat(5, "A5", 'A', movie));
		totalSeats.add(new Seat(6, "B1", 'B', movie));
		totalSeats.add(new Seat(7, "B2", 'B', movie));
		totalSeats.add(new Seat(8, "B3", 'B', movie));
		totalSeats.add(new Seat(9, "B4", 'B', movie));
		totalSeats.add(new Seat(10, "B5", 'B', movie));
		totalSeats.add(new Seat(11, "C1", 'C', movie));
		totalSeats.add(new Seat(12, "C2", 'C', movie));
		totalSeats.add(new Seat(13, "C3", 'C', movie));
		totalSeats.add(new Seat(14, "C4", 'C', movie));
		totalSeats.add(new Seat(15, "C5", 'C', movie));

	}

	public Map<String, String> buyMovieTicket(List<String> seatList, String movieName) {
		return null;
	}

}
