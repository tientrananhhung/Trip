package edu.poly.impl;

import edu.poly.entity.Tickets;
import edu.poly.repository.TicketRepository;
import edu.poly.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class TicketImpl implements TicketService {

    @Autowired
    TicketRepository repository;

    public Iterable<Tickets> findAll() {
        return repository.findAll();
    }
}
