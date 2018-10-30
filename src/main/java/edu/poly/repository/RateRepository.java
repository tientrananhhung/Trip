package edu.poly.repository;

import edu.poly.entity.Rates;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateRepository extends CrudRepository<Rates, Integer> {

}
