package edu.poly.service;

import edu.poly.entity.Offers;

import java.util.Optional;

public interface OfferService {

    public Iterable<Offers> findAll();

    public Optional<Offers> findOne(Integer id);

    public Offers save(Offers offers);

    public Iterable<Offers> save(Iterable<Offers> offers);

    public Offers update(Offers offers);

    public Iterable<Offers> update(Iterable<Offers> offers);

    public void delete(Offers offers);

    public void delete(Iterable<Offers> offers);

    public void deleteById(Integer id);

}
