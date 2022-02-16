package com.techreturners.cc.seat.service;

import java.util.List;
import java.util.Map;

import com.techreturners.cc.model.Seat;

public interface SeatService {
	Map<String,String> getAvailableSeatInfo(int seatList, List<Seat> totalSeats);

}
