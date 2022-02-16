package com.techreturners.cc.seat.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.techreturners.cc.model.Seat;
import com.techreturners.cc.seat.service.SeatService;

public class SeatServiceImpl implements SeatService {

	public Map<String, String> getAvailableSeatInfo(int noOfTicket, List<Seat> totalSeats) {
		Map<String, String> seatInfo = new HashMap<String, String>();
		StringBuilder availableSeats = new StringBuilder();
		List<Seat> availableSeatList = totalSeats.stream().filter(p -> !p.isBooked()).collect(Collectors.toList());
		if (availableSeatList.size() >= noOfTicket) {
			int count = 1;
			for (Seat seat : availableSeatList) {
				if (count <= noOfTicket) {

					availableSeats.append(seat.getSeatNumber() + " ");
					seat.setBooked(true);
					count++;
				}
			}
			seatInfo.put("AvailableSeats", availableSeats.toString());
		}

		return seatInfo;
	}
}
