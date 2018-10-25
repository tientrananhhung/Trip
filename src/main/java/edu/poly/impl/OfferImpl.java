package edu.poly.impl;

import edu.poly.entity.Offers;
import edu.poly.repository.OfferRepository;
import edu.poly.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class OfferImpl implements OfferService {

    @Autowired
    OfferRepository repository;

    public Iterable<Offers> findAll() {
        return repository.findAll();
    }
}
