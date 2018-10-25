package edu.poly.repository;

import edu.poly.entity.FoodInfors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodInforRepository extends CrudRepository<FoodInfors, Integer> {

}
