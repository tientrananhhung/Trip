package edu.poly.impl;

import edu.poly.model.Offers;
import edu.poly.repository.OfferRepository;
import edu.poly.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class OfferImpl implements OfferService {

    @Autowired
    OfferRepository repository;

    public Iterable<Offers> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Offers> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Offers save(Offers offers) {
        return repository.save(offers);
    }

    @Override
    public Iterable<Offers> save(Iterable<Offers> offers) {
        return repository.saveAll(offers);
    }

    @Override
    public Offers update(Offers offers) {
        return repository.save(offers);
    }

    @Override
    public Iterable<Offers> update(Iterable<Offers> offers) {
        return repository.saveAll(offers);
    }

    @Override
    public void delete(Offers offers) {
        repository.delete(offers);
    }

    @Override
    public void delete(Iterable<Offers> offers) {
        repository.deleteAll(offers);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
