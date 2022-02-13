package com.techreturners.cc.ticket.service;

import java.util.List;
import java.util.Map;

public interface TicketService {
	
	Map<String, String> buyMovieTicket(List<String> seatList, String movieName);

}
