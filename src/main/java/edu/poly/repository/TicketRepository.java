package edu.poly.repository;

import edu.poly.model.Tickets;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<Tickets, Integer> {

}
