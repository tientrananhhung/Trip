package edu.poly.repository;

import edu.poly.entity.FoodCategorys;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodCategoryRepository extends CrudRepository<FoodCategorys, Integer> {

}
