package edu.poly.service;

import edu.poly.entity.Offers;

public interface OfferService {
    Iterable<Offers> findAll();
}
