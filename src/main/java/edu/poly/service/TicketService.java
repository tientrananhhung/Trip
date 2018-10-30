package edu.poly.service;

import edu.poly.entity.Tickets;

import java.util.Optional;

public interface TicketService {

    public Iterable<Tickets> findAll();

    public Optional<Tickets> findOne(Integer id);

    public Tickets save(Tickets tickets);

    public Iterable<Tickets> save(Iterable<Tickets> tickets);

    public Tickets update(Tickets tickets);

    public Iterable<Tickets> update(Iterable<Tickets> tickets);

    public void delete(Tickets tickets);

    public void delete(Iterable<Tickets> tickets);

    public void deleteById(Integer id);

}
