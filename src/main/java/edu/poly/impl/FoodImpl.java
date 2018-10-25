package edu.poly.impl;

import edu.poly.entity.Foods;
import edu.poly.repository.FoodRepository;
import edu.poly.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class FoodImpl implements FoodService {

    @Autowired
    FoodRepository repository;

    public Iterable<Foods> findAll() {
        return repository.findAll();
    }
}
