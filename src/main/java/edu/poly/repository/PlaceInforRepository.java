package edu.poly.repository;

import edu.poly.model.PlaceInfors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceInforRepository extends CrudRepository<PlaceInfors, Integer> {

}
