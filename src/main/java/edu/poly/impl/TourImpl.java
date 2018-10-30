package edu.poly.impl;

import edu.poly.model.Tours;
import edu.poly.repository.TourRepository;
import edu.poly.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class TourImpl implements TourService {

    @Autowired
    TourRepository repository;

    public Iterable<Tours> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Tours> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Tours save(Tours tours) {
        return repository.save(tours);
    }

    @Override
    public Iterable<Tours> save(Iterable<Tours> tours) {
        return repository.saveAll(tours);
    }

    @Override
    public Tours update(Tours tours) {
        return repository.save(tours);
    }

    @Override
    public Iterable<Tours> update(Iterable<Tours> tours) {
        return repository.saveAll(tours);
    }

    @Override
    public void delete(Tours tours) {
        repository.delete(tours);
    }

    @Override
    public void delete(Iterable<Tours> tours) {
        repository.deleteAll(tours);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
