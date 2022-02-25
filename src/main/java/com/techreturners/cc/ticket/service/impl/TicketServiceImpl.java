package com.techreturners.cc.ticket.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techreturners.cc.model.Movie;
import com.techreturners.cc.model.Seat;
import com.techreturners.cc.model.Theatre;
import com.techreturners.cc.seat.service.SeatService;
import com.techreturners.cc.seat.service.impl.SeatServiceImpl;
import com.techreturners.cc.ticket.service.TicketService;

public class TicketServiceImpl implements TicketService {
	List<Seat> totalSeats = new ArrayList<Seat>();
	SeatService seatService = new SeatServiceImpl();
	private final int MIN_NUM = 1;
	private final int MAX_NUM = 3;

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

	public Map<String, String> buyMovieTicket(int noOfTicket, String movieName) throws Exception {
		Map<String, String> resultMap = new HashMap<String, String>();
		if (noOfTicket >= MIN_NUM && noOfTicket <= MAX_NUM) {
			Map<String, String> seatInfo = seatService.getAvailableSeatInfo(noOfTicket, totalSeats);
			if (seatInfo.containsKey("AvailableSeats")) {
				resultMap.put("message", "Successfully booked your Ticket for " + seatInfo.get("AvailableSeats"));
				resultMap.put("BookedSeats", seatInfo.get("AvailableSeats"));
				resultMap.put("status", "Success");
			} else {
				resultMap.put("message", "Sorry for the inconvenience request number tickets are unavailable");
				resultMap.put("status", "Failure");
				resultMap.put("BookedSeats", "0");

			}
		} else {
			throw new Exception("Please choose minimum 1 ticket and maximum of 3 tickets");
		}
		return resultMap;
	}

}
