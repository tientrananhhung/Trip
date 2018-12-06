package edu.poly.service;

import edu.poly.entity.Partners;

import java.util.List;
import java.util.Optional;

public interface PartnerService {

    public Iterable<Partners> findAll();

    public Optional<Partners> findOne(Integer id);

    public Partners save(Partners partners);

    public Iterable<Partners> save(Iterable<Partners> partners);

    public Partners update(Partners partners);

    public Iterable<Partners> update(Iterable<Partners> partners);

    public void delete(Partners partners);

    public void delete(Iterable<Partners> partners);

    public void deleteById(Integer id);

    public List<Partners> findAllByDeleted(boolean deleted);

    public Partners getById(Integer id);

    public boolean existsByEmail(String email);

    public boolean existsByPhone(String phone);
}
