package edu.poly.impl;

import edu.poly.entity.Rates;
import edu.poly.repository.RateRepository;
import edu.poly.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class RateImpl implements RateService {

    @Autowired
    RateRepository repository;

    public Iterable<Rates> findAll() {
        return repository.findAll();
    }
}
