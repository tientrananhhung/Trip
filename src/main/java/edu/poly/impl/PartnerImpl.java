package edu.poly.impl;

import edu.poly.entity.Partners;
import edu.poly.repository.PartnerRepository;
import edu.poly.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class PartnerImpl implements PartnerService {

    @Autowired
    PartnerRepository repository;

    public Iterable<Partners> findAll() {
        return repository.findAll();
    }
}
