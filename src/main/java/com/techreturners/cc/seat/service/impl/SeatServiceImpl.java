package com.techreturners.cc.seat.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.techreturners.cc.movie.model.Movie;
import com.techreturners.cc.seat.model.Seat;
import com.techreturners.cc.seat.service.SeatService;
import com.techreturners.cc.theatre.model.Theatre;

public class SeatServiceImpl implements SeatService {
	List<Seat> totalSeats = new ArrayList<Seat>();

	public SeatServiceImpl() {
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

	public boolean isSeatAvailable(String setNo) {
		Seat seat = totalSeats.stream().filter(p -> p.getSeatNumber().equalsIgnoreCase(setNo))
				.collect(Collectors.toList()).get(0);
		if (seat.isBooked())
			return false;
		else {
			seat.setBooked(true);
			return true;
		}
	}

}
