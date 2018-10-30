package edu.poly.repository;

import edu.poly.model.Foods;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<Foods, Integer> {

}
