package com.tectreturners.cc.ticket;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.techreturners.cc.ticket.service.TicketService;
import com.techreturners.cc.ticket.service.impl.TicketServiceImpl;

public class TicketServiceTest {
	TicketService ticketService;

	@Before
	public void init() {
		ticketService = new TicketServiceImpl();
	}

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	@Test
	public void buyMovieTicketSuccessAndFailiureTest() throws Exception {
		int noOfTicket = 3;
		String movieName = "Boss Baby";
		Map<String, String> resultMap1 = ticketService.buyMovieTicket(noOfTicket, movieName);
		Map<String, String> resultMap2 = ticketService.buyMovieTicket(noOfTicket, movieName);
		Map<String, String> resultMap3 = ticketService.buyMovieTicket(noOfTicket, movieName);
		Map<String, String> resultMap4 = ticketService.buyMovieTicket(noOfTicket, movieName);
		Map<String, String> resultMap5 = ticketService.buyMovieTicket(noOfTicket, movieName);
		Map<String, String> resultMap6 = ticketService.buyMovieTicket(3, "Boss Baby");
		assertEquals("Failiure", resultMap6.get("status"));
		assertEquals("Success", resultMap1.get("status"));
		assertEquals("Success", resultMap2.get("status"));
		assertEquals("Success", resultMap3.get("status"));
		assertEquals("Success", resultMap4.get("status"));
		assertEquals("Success", resultMap5.get("status"));

	}

	@Test
	public void buyMovieTicketMinTest() throws Exception {
		expectedEx.expect(Exception.class);
		expectedEx.expectMessage("Please choose minimum 1 ticket and maximum of 3 tickets");
		ticketService.buyMovieTicket(0, "Boss Baby");

	}

	@Test
	public void buyMovieTicketMaxTest() throws Exception {
		expectedEx.expect(Exception.class);
		expectedEx.expectMessage("Please choose minimum 1 ticket and maximum of 3 tickets");
		ticketService.buyMovieTicket(9, "Boss Baby");

	}

	@Test
	public void buyMovieTicketNegativeTest() throws Exception {
		expectedEx.expect(Exception.class);
		expectedEx.expectMessage("Please choose minimum 1 ticket and maximum of 3 tickets");
		ticketService.buyMovieTicket(-3, "Boss Baby");

	}

}
