package edu.poly.service;

import edu.poly.entity.Rates;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface RateService {

    public Iterable<Rates> findAll();

    public Optional<Rates> findOne(Integer id);

    public Rates save(Rates rates);

    public Iterable<Rates> save(Iterable<Rates> rates);

    public Rates update(Rates rates);

    public Iterable<Rates> update(Iterable<Rates> rates);

    public void delete(Rates rates);

    public void delete(Iterable<Rates> rates);

    public void deleteById(Integer id);

    public Page<Rates> findByTourId(int tourId, Pageable pageable);

}
