package edu.poly.service;

import edu.poly.entity.Foods;

import java.util.Optional;

public interface FoodService {

    public Iterable<Foods> findAll();

    public Optional<Foods> findOne(Integer id);

    public Foods save(Foods foods);

    public Iterable<Foods> save(Iterable<Foods> foods);

    public Foods update(Foods foods);

    public Iterable<Foods> update(Iterable<Foods> foods);

    public void delete(Foods foods);

    public void delete(Iterable<Foods> foods);

    public void deleteById(Integer id);

}
