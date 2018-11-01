package edu.poly.service;

import edu.poly.entity.FoodCategorys;

import java.util.List;
import java.util.Optional;

public interface FoodCategoryService {

    public Iterable<FoodCategorys> findAll();

    public Optional<FoodCategorys> findOne(Integer id);

    public FoodCategorys save(FoodCategorys foodCategorys);

    public Iterable<FoodCategorys> save(Iterable<FoodCategorys> foodCategorys);

    public FoodCategorys update(FoodCategorys foodCategorys);

    public Iterable<FoodCategorys> update(Iterable<FoodCategorys> foodCategorys);

    public void delete(FoodCategorys foodCategorys);

    public void delete(Iterable<FoodCategorys> foodCategorys);

    public void deleteById(Integer id);

    public FoodCategorys getById(Integer id);

    public List<FoodCategorys> findAllByDeleted(Boolean deleted);

}
