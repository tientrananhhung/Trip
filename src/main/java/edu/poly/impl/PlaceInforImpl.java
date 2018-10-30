package edu.poly.impl;

import edu.poly.entity.PlaceInfors;
import edu.poly.repository.PlaceInforRepository;
import edu.poly.service.PlaceInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class PlaceInforImpl implements PlaceInforService {

    @Autowired
    PlaceInforRepository repository;

    public Iterable<PlaceInfors> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<PlaceInfors> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public PlaceInfors save(PlaceInfors placeInfors) {
        return repository.save(placeInfors);
    }

    @Override
    public Iterable<PlaceInfors> save(Iterable<PlaceInfors> placeInfors) {
        return repository.saveAll(placeInfors);
    }

    @Override
    public PlaceInfors update(PlaceInfors placeInfors) {
        return repository.save(placeInfors);
    }

    @Override
    public Iterable<PlaceInfors> update(Iterable<PlaceInfors> placeInfors) {
        return repository.saveAll(placeInfors);
    }

    @Override
    public void delete(PlaceInfors placeInfors) {
        repository.delete(placeInfors);
    }

    @Override
    public void delete(Iterable<PlaceInfors> placeInfors) {
        repository.deleteAll(placeInfors);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
