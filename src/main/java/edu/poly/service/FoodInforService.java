package edu.poly.service;

import edu.poly.model.FoodInfors;

import java.util.Optional;

public interface FoodInforService {

    public Iterable<FoodInfors> findAll();

    public Optional<FoodInfors> findOne(Integer id);

    public FoodInfors save(FoodInfors foodInfors);

    public Iterable<FoodInfors> save(Iterable<FoodInfors> foodInfors);

    public FoodInfors update(FoodInfors foodInfors);

    public Iterable<FoodInfors> update(Iterable<FoodInfors> foodInfors);

    public void delete(FoodInfors foodInfors);

    public void delete(Iterable<FoodInfors> foodInfors);

    public void deleteById(Integer id);

}
