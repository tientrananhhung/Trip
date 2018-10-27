package edu.poly.impl;

import edu.poly.entity.FoodCategorys;
import edu.poly.repository.FoodCategoryRepository;
import edu.poly.service.FoodCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class FoodCategoryImpl implements FoodCategoryService {

    @Autowired
    FoodCategoryRepository repository;

    public Iterable<FoodCategorys> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<FoodCategorys> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public FoodCategorys save(FoodCategorys foodCategorys) {
        return repository.save(foodCategorys);
    }

    @Override
    public Iterable<FoodCategorys> save(Iterable<FoodCategorys> foodCategorys) {
        return repository.saveAll(foodCategorys);
    }

    @Override
    public FoodCategorys update(FoodCategorys foodCategorys) {
        return repository.save(foodCategorys);
    }

    @Override
    public Iterable<FoodCategorys> update(Iterable<FoodCategorys> foodCategorys) {
        return repository.saveAll(foodCategorys);
    }

    @Override
    public void delete(FoodCategorys foodCategorys) {
        repository.delete(foodCategorys);
    }

    @Override
    public void delete(Iterable<FoodCategorys> foodCategorys) {
        repository.deleteAll(foodCategorys);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
