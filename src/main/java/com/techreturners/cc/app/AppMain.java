package com.techreturners.cc.app;

import java.util.Map;

import com.techreturners.cc.ticket.service.TicketService;
import com.techreturners.cc.ticket.service.impl.TicketServiceImpl;

public class AppMain {
	public static void main(String[] args) throws Exception {
		TicketService ticketService = new TicketServiceImpl();
		Map<String, String> result = ticketService.buyMovieTicket(3, "Boss Baby");
		System.out.println(result);
	}
}
