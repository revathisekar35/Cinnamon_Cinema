package com.techreturners.cc.ticket.service;

import java.util.Map;

public interface TicketService {
	
	Map<String, String> buyMovieTicket(int noOfTicket, String movieName) throws Exception;

}
