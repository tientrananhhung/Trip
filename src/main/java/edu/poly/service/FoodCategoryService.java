package edu.poly.service;

import edu.poly.entity.FoodCategorys;

public interface FoodCategoryService {
    Iterable<FoodCategorys> findAll();
}
