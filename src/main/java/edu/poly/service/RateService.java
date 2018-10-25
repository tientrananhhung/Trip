package edu.poly.service;

import edu.poly.entity.Rates;

public interface RateService {
    Iterable<Rates> findAll();
}
