package edu.poly.impl;

import edu.poly.entity.FoodCategorys;
import edu.poly.repository.FoodCategoryRepository;
import edu.poly.service.FoodCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class FoodCategoryImpl implements FoodCategoryService {

    @Autowired
    FoodCategoryRepository repository;

    public Iterable<FoodCategorys> findAll() {
        return repository.findAll();
    }
}
