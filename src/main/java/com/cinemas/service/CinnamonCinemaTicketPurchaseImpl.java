package com.cinemas.service;

import com.cinemas.vo.CinnamonCinemas;

import java.util.ArrayList;
import java.util.List;

public class CinnamonCinemaTicketPurchaseImpl implements TicketPurchase{

    private CinnamonCinemas cinnamonCinemas;

    public CinnamonCinemaTicketPurchaseImpl() {
        cinnamonCinemas = new CinnamonCinemas();
    }

    @Override
    public List<String> bookTickets(int numberOfSeatsSelected) throws Exception {
        List<String> bookedTickets;
        if (numberOfSeatsSelected > 3) {
            throw new Exception("Number of Seats selected should be less than 3");
        }
        List<String> availableTicketsClone = new ArrayList<>(cinnamonCinemas.getRow_seats_combo());
        if(availableTicketsClone.size() > 0) {
            bookedTickets = availableTicketsClone.subList(0, numberOfSeatsSelected);
        } else {
            throw new Exception("All the tickets were booked.");
        }
        cinnamonCinemas.getRow_seats_combo().removeAll(bookedTickets);
        return bookedTickets;
    }

    @Override
    public List<String> getAvailableTickets() {
        return cinnamonCinemas.getRow_seats_combo();
    }
}
