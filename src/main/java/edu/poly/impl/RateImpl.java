package edu.poly.impl;

import edu.poly.entity.Rates;
import edu.poly.repository.RateRepository;
import edu.poly.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class RateImpl implements RateService {

    @Autowired
    RateRepository repository;

    public Iterable<Rates> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Rates> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Rates save(Rates rates) {
        return repository.save(rates);
    }

    @Override
    public Iterable<Rates> save(Iterable<Rates> rates) {
        return repository.saveAll(rates);
    }

    @Override
    public Rates update(Rates rates) {
        return repository.save(rates);
    }

    @Override
    public Iterable<Rates> update(Iterable<Rates> rates) {
        return repository.saveAll(rates);
    }

    @Override
    public void delete(Rates rates) {
        repository.delete(rates);
    }

    @Override
    public void delete(Iterable<Rates> rates) {
        repository.deleteAll(rates);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
