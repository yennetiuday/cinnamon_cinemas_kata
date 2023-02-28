package com.cinemas.main;

import com.cinemas.service.CinnamonCinemaTicketPurchaseImpl;
import com.cinemas.service.TicketPurchase;

public class Main {

    public static void main(String[] args) {
        TicketPurchase ticketBooking = new CinnamonCinemaTicketPurchaseImpl();
        try {
            System.out.println(ticketBooking.bookTickets(3).toString());
            System.out.println(ticketBooking.getAvailableTickets().toString());
            System.out.println(ticketBooking.bookTickets(2).toString());
            System.out.println(ticketBooking.getAvailableTickets().toString());
            System.out.println(ticketBooking.bookTickets(2).toString());
            System.out.println(ticketBooking.getAvailableTickets().toString());
            System.out.println(ticketBooking.bookTickets(1).toString());
            System.out.println(ticketBooking.getAvailableTickets().toString());
            System.out.println(ticketBooking.bookTickets(2).toString());
            System.out.println(ticketBooking.getAvailableTickets().toString());
            System.out.println(ticketBooking.bookTickets(4).toString());
            System.out.println(ticketBooking.getAvailableTickets().toString());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
