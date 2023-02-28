package com.cinemas.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CinnamonCinemaTicketPurchaseImplTest {

    private static TicketPurchase ticketBooking;

    @BeforeAll
    static void setUp() {
        ticketBooking = new CinnamonCinemaTicketPurchaseImpl();
    }

    @Test
    public void TestCinnamonCinemasTicketPurchase() throws Exception {
        List<String> expectedAllTickets = Arrays.asList("A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "B4",
                "B5", "C1", "C2", "C3", "C4", "C5");
        assertEquals(expectedAllTickets, ticketBooking.getAvailableTickets());
        assertEquals(Arrays.asList("A1", "A2", "A3"), ticketBooking.bookTickets(3));
        assertEquals(Arrays.asList("A4", "A5"), ticketBooking.bookTickets(2));
        assertEquals(Arrays.asList("B1", "B2"), ticketBooking.bookTickets(2));
        assertEquals(Arrays.asList("B3", "B4"), ticketBooking.bookTickets(2));
        assertEquals(Arrays.asList("B5"), ticketBooking.bookTickets(1));
        assertEquals(Arrays.asList("C1", "C2"), ticketBooking.bookTickets(2));
    }

    @Test
    public void TestBookCinnamonCinemasError() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> ticketBooking.bookTickets(4));
        assertEquals("Number of Seats selected should be less than 3" , exception.getMessage());
    }
}
