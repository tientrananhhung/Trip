package edu.poly.repository;

import edu.poly.model.Offers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends CrudRepository<Offers, Integer> {

}
