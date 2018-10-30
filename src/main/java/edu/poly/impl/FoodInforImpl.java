package edu.poly.impl;

import edu.poly.model.FoodInfors;
import edu.poly.repository.FoodInforRepository;
import edu.poly.service.FoodInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class FoodInforImpl implements FoodInforService {

    @Autowired
    FoodInforRepository repository;

    public Iterable<FoodInfors> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<FoodInfors> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public FoodInfors save(FoodInfors foodInfors) {
        return repository.save(foodInfors);
    }

    @Override
    public Iterable<FoodInfors> save(Iterable<FoodInfors> foodInfors) {
        return repository.saveAll(foodInfors);
    }

    @Override
    public FoodInfors update(FoodInfors foodInfors) {
        return repository.save(foodInfors);
    }

    @Override
    public Iterable<FoodInfors> update(Iterable<FoodInfors> foodInfors) {
        return repository.saveAll(foodInfors);
    }

    @Override
    public void delete(FoodInfors foodInfors) {
        repository.delete(foodInfors);
    }

    @Override
    public void delete(Iterable<FoodInfors> foodInfors) {
        repository.deleteAll(foodInfors);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
