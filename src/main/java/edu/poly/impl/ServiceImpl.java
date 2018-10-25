package edu.poly.impl;

import edu.poly.entity.Services;
import edu.poly.repository.ServiceRepository;
import edu.poly.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ServiceImpl implements ServiceService {

    @Autowired
    ServiceRepository repository;

    public Iterable<Services> findAll() {
        return repository.findAll();
    }
}
