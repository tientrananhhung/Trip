package edu.poly.impl;

import edu.poly.entity.PlaceInfors;
import edu.poly.repository.PlaceInforRepository;
import edu.poly.service.PlaceInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class PlaceInforImpl implements PlaceInforService {

    @Autowired
    PlaceInforRepository repository;

    public Iterable<PlaceInfors> findAll() {
        return repository.findAll();
    }
}
