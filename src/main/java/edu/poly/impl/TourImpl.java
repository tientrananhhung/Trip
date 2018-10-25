package edu.poly.impl;

import edu.poly.entity.Tours;
import edu.poly.repository.TourRepository;
import edu.poly.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class TourImpl implements TourService {

    @Autowired
    TourRepository repository;

    public Iterable<Tours> findAll() {
        return repository.findAll();
    }
}
