package edu.poly.repository;

import edu.poly.entity.Offers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferRepository extends CrudRepository<Offers, Integer> {

    public Offers getById(Integer id);

    public List<Offers> findAllByUsed(Boolean used);

}
