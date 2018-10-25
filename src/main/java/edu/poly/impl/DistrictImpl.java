package edu.poly.impl;

import edu.poly.entity.Districts;
import edu.poly.repository.DistrictRepository;
import edu.poly.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class DistrictImpl implements DistrictService {

    @Autowired
    DistrictRepository repository;

    public Iterable<Districts> findAll() {
        return repository.findAll();
    }
}
