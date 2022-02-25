package com.tectreturners.cc.ticket;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.techreturners.cc.ticket.service.TicketService;
import com.techreturners.cc.ticket.service.impl.TicketServiceImpl;

public class TicketServiceTest {
	TicketService ticketService;
	TicketService ticketServicemock;

	@Before
	public void init() {
		ticketService = new TicketServiceImpl();
		ticketServicemock = mock(TicketService.class);
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
		Map<String, String> resultMap6 = ticketService.buyMovieTicket(noOfTicket, movieName);
		// Failure 
		assertEquals("Success", resultMap1.get("status"));
		assertEquals("A1 A2 A3 ", resultMap1.get("BookedSeats"));
		assertEquals("Success", resultMap2.get("status"));
		assertEquals("A4 A5 B1 ", resultMap2.get("BookedSeats"));
		assertEquals("Success", resultMap3.get("status"));
		assertEquals("B2 B3 B4 ", resultMap3.get("BookedSeats"));
		assertEquals("Success", resultMap4.get("status"));
		assertEquals("B5 C1 C2 ", resultMap4.get("BookedSeats"));
		assertEquals("Success", resultMap5.get("status"));
		assertEquals("C3 C4 C5 ", resultMap5.get("BookedSeats"));
		assertEquals("Failure", resultMap6.get("status"));
		assertEquals("0", resultMap6.get("BookedSeats"));
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
	
	@Test
	public void buyMovieTicketSuccessWithMockTest() throws Exception {
		Map<String,String> responseMap = new HashMap<String, String>();
		responseMap.put("status", "Success");
		when(ticketServicemock.buyMovieTicket(3, "Sping2")).thenReturn(responseMap);
		Map<String,String> test = ticketServicemock.buyMovieTicket(3, "Sping2");
		assertEquals("Success", test.get("status"));
	}
	
	@Test
	public void buyMovieTicketFailsWithMockTest() throws Exception {
		Map<String,String> responseMap = new HashMap<String, String>();
		responseMap.put("status", "Failiure");
		when(ticketServicemock.buyMovieTicket(17, "Sping2")).thenReturn(responseMap);
		Map<String,String> test = ticketServicemock.buyMovieTicket(17, "Sping2");
		assertEquals("Failiure", test.get("status"));
	}
	
	@Test
	public void buyMovieTicketSeatWithMockTest() throws Exception {
		Map<String,String> responseMap1 = new HashMap<String, String>();
		responseMap1.put("BookedSeats", "A1");
		Map<String,String> responseMap2 = new HashMap<String, String>();
		responseMap2.put("BookedSeats", "A1 A2");
		Map<String,String> responseMap3 = new HashMap<String, String>();
		responseMap3.put("BookedSeats", "A1 A2 A3");
		when(ticketServicemock.buyMovieTicket(1, "Sping2")).thenReturn(responseMap1);
		when(ticketServicemock.buyMovieTicket(2, "Sping2")).thenReturn(responseMap2);
		when(ticketServicemock.buyMovieTicket(3, "Sping2")).thenReturn(responseMap3);		
		assertEquals("A1",(ticketServicemock.buyMovieTicket(1, "Sping2")).get("BookedSeats"));
		assertEquals("A1 A2",(ticketServicemock.buyMovieTicket(2, "Sping2")).get("BookedSeats"));
		assertEquals("A1 A2 A3",(ticketServicemock.buyMovieTicket(3, "Sping2")).get("BookedSeats"));
	}

}
