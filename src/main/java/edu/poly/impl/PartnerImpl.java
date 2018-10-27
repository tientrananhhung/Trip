package edu.poly.impl;

import edu.poly.entity.Partners;
import edu.poly.repository.PartnerRepository;
import edu.poly.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class PartnerImpl implements PartnerService {

    @Autowired
    PartnerRepository repository;

    public Iterable<Partners> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Partners> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Partners save(Partners partners) {
        return repository.save(partners);
    }

    @Override
    public Iterable<Partners> save(Iterable<Partners> partners) {
        return repository.saveAll(partners);
    }

    @Override
    public Partners update(Partners partners) {
        return repository.save(partners);
    }

    @Override
    public Iterable<Partners> update(Iterable<Partners> partners) {
        return repository.saveAll(partners);
    }

    @Override
    public void delete(Partners partners) {
        repository.delete(partners);
    }

    @Override
    public void delete(Iterable<Partners> partners) {
        repository.deleteAll(partners);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
