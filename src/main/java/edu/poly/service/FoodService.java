package edu.poly.service;

import edu.poly.entity.Foods;

public interface FoodService {
    Iterable<Foods> findAll();
}
