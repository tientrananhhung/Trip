package edu.poly.repository;

import edu.poly.entity.Foods;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends CrudRepository<Foods, Integer> {
    public Foods getById(Integer id);

    public List<Foods> findAllByDeleted(Boolean isDeleted);
}
