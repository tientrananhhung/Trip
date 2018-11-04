package edu.poly.service;

import edu.poly.entity.Tours;

import java.util.List;
import java.util.Optional;

public interface TourService {

    Iterable<Tours> findAll();

    Optional<Tours> findOne(Integer id);

    Tours save(Tours tours);

    Iterable<Tours> save(Iterable<Tours> tours);

    Tours update(Tours tours);

    Iterable<Tours> update(Iterable<Tours> tours);

    void delete(Tours tours);

    void delete(Iterable<Tours> tours);

    void deleteById(Integer id);

    List<Tours> findAllByDeleted(Boolean isDeleted);

    Tours getById(Integer id);

}
