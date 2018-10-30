package edu.poly.impl;

import edu.poly.entity.Tickets;
import edu.poly.repository.TicketRepository;
import edu.poly.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class TicketImpl implements TicketService {

    @Autowired
    TicketRepository repository;

    public Iterable<Tickets> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Tickets> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Tickets save(Tickets tickets) {
        return repository.save(tickets);
    }

    @Override
    public Iterable<Tickets> save(Iterable<Tickets> tickets) {
        return repository.saveAll(tickets);
    }

    @Override
    public Tickets update(Tickets tickets) {
        return repository.save(tickets);
    }

    @Override
    public Iterable<Tickets> update(Iterable<Tickets> tickets) {
        return repository.saveAll(tickets);
    }

    @Override
    public void delete(Tickets tickets) {
        repository.delete(tickets);
    }

    @Override
    public void delete(Iterable<Tickets> tickets) {
        repository.deleteAll(tickets);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
