package edu.poly.service;

import edu.poly.entity.PlaceInfors;

import java.util.Optional;

public interface PlaceInforService {

    public Iterable<PlaceInfors> findAll();

    public Optional<PlaceInfors> findOne(Integer id);

    public PlaceInfors save(PlaceInfors placeInfors);

    public Iterable<PlaceInfors> save(Iterable<PlaceInfors> placeInfors);

    public PlaceInfors update(PlaceInfors placeInfors);

    public Iterable<PlaceInfors> update(Iterable<PlaceInfors> placeInfors);

    public void delete(PlaceInfors placeInfors);

    public void delete(Iterable<PlaceInfors> placeInfors);

    public void deleteById(Integer id);

}
