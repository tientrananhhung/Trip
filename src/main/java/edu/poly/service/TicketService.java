package edu.poly.service;

import edu.poly.entity.Tickets;

public interface TicketService {
    Iterable<Tickets> findAll();
}
