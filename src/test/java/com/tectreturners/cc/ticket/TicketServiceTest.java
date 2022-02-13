package com.tectreturners.cc.ticket;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.techreturners.cc.ticket.service.TicketService;
import com.techreturners.cc.ticket.service.impl.TicketServiceImpl;

public class TicketServiceTest {
	
	@Test
	public void buyMovieTicketTest() {
		TicketService ticketService = new TicketServiceImpl();
		List<String> seatList = new ArrayList<String>();
		seatList.add("A1");
		seatList.add("A2");
		seatList.add("A3");
		String movieName = "Boss Baby";
		ticketService.buyMovieTicket(seatList,movieName);
	}

}
