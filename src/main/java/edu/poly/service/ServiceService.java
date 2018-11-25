package edu.poly.service;

import edu.poly.entity.Services;

import java.util.Optional;

public interface ServiceService {

    public Iterable<Services> findAll();

    public Optional<Services> findOne(Integer id);

    public Services save(Services services);

    public Iterable<Services> save(Iterable<Services> services);

    public Services update(Services services);

    public Iterable<Services> update(Iterable<Services> services);

    public void delete(Services services);

    public void delete(Iterable<Services> services);

    public void deleteById(Integer id);

    public Services findServiceById(Integer id);

}
