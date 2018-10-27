package edu.poly.service;

import edu.poly.entity.Tours;

import java.util.Optional;

public interface TourService {

    public Iterable<Tours> findAll();

    public Optional<Tours> findOne(Integer id);

    public Tours save(Tours tours);

    public Iterable<Tours> save(Iterable<Tours> tours);

    public Tours update(Tours tours);

    public Iterable<Tours> update(Iterable<Tours> tours);

    public void delete(Tours tours);

    public void delete(Iterable<Tours> tours);

    public void deleteById(Integer id);

}
