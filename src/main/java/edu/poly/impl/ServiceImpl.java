package edu.poly.impl;

import edu.poly.model.Services;
import edu.poly.repository.ServiceRepository;
import edu.poly.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class ServiceImpl implements ServiceService {

    @Autowired
    ServiceRepository repository;

    public Iterable<Services> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Services> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Services save(Services services) {
        return repository.save(services);
    }

    @Override
    public Iterable<Services> save(Iterable<Services> services) {
        return repository.saveAll(services);
    }

    @Override
    public Services update(Services services) {
        return repository.save(services);
    }

    @Override
    public Iterable<Services> update(Iterable<Services> services) {
        return repository.saveAll(services);
    }

    @Override
    public void delete(Services services) {
        repository.delete(services);
    }

    @Override
    public void delete(Iterable<Services> services) {
        repository.deleteAll(services);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
