package edu.poly.impl;

import edu.poly.entity.FoodInfors;
import edu.poly.repository.FoodInforRepository;
import edu.poly.service.FoodInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class FoodInforImpl implements FoodInforService {

    @Autowired
    FoodInforRepository repository;

    public Iterable<FoodInfors> findAll() {
        return repository.findAll();
    }
}
