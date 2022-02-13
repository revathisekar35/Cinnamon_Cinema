package com.techreturners.cc.ticket.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techreturners.cc.seat.service.SeatService;
import com.techreturners.cc.seat.service.impl.SeatServiceImpl;
import com.techreturners.cc.ticket.service.TicketService;

public class TicketServiceImpl implements TicketService {
	
	SeatService seatService = new SeatServiceImpl();

	

	public Map<String, String> buyMovieTicket(List<String> seatList, String movieName) {
		Map<String,String> resultMap = new HashMap<String, String>();
		boolean isBooked = false;
		for (String seat : seatList) {
			isBooked = seatService.isSeatAvailable(seat);
		}
		if(isBooked) {
			resultMap.put("message","Successfully booked your Ticket");
			resultMap.put("status", "Success");
		}else {
			resultMap.put("message","Sorry for the inconvenience, your request tickets are unavailable");
			resultMap.put("status", "Failiure");
		}
		return resultMap;
	}

}
