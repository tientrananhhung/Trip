package edu.poly.repository;

import edu.poly.entity.FoodCategorys;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodCategoryRepository extends CrudRepository<FoodCategorys, Integer> {

    public FoodCategorys getById(Integer id);

    @Query("from  FoodCategorys  where Is_deleted = :isDeleted")
    public List<FoodCategorys> getAllByDeleted(@Param("isDeleted") boolean isDeleted);

}
