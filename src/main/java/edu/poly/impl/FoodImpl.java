package edu.poly.impl;

import edu.poly.entity.Foods;
import edu.poly.repository.FoodRepository;
import edu.poly.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class FoodImpl implements FoodService {

    @Autowired
    FoodRepository repository;

    public Iterable<Foods> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Foods> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Foods save(Foods foods) {
        return repository.save(foods);
    }

    @Override
    public Iterable<Foods> save(Iterable<Foods> foods) {
        return repository.saveAll(foods);
    }

    @Override
    public Foods update(Foods foods) {
        return repository.save(foods);
    }

    @Override
    public Iterable<Foods> update(Iterable<Foods> foods) {
        return repository.saveAll(foods);
    }

    @Override
    public void delete(Foods foods) {
        repository.delete(foods);
    }

    @Override
    public void delete(Iterable<Foods> foods) {
        repository.deleteAll(foods);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Foods getById(Integer id) {
        return repository.getById(id);
    }

    @Override
    public List<Foods> findAllByDeleted(Boolean isDeleted) {
        return repository.findAllByDeleted(isDeleted);
    }

}
