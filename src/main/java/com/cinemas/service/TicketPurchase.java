package com.cinemas.service;

import java.util.List;

public interface TicketPurchase {
    public List<String> bookTickets(int numberOfSeatsSelected) throws Exception;
    public List<String> getAvailableTickets();
}
