package edu.poly.repository;

import edu.poly.entity.FoodCategorys;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodCategoryRepository extends CrudRepository<FoodCategorys, Integer> {

    public FoodCategorys getById(Integer id);

    public List<FoodCategorys> findAllByDeleted(Boolean deleted);

}
