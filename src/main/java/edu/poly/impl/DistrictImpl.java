package edu.poly.impl;

import edu.poly.entity.Districts;
import edu.poly.repository.DistrictRepository;
import edu.poly.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class DistrictImpl implements DistrictService {

    @Autowired
    DistrictRepository repository;

    public Iterable<Districts> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Districts> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Districts save(Districts districts) {
        return repository.save(districts);
    }

    @Override
    public Iterable<Districts> save(Iterable<Districts> districts) {
        return repository.saveAll(districts);
    }

    @Override
    public Districts update(Districts districts) {
        return repository.save(districts);
    }

    @Override
    public Iterable<Districts> update(Iterable<Districts> districts) {
        return repository.saveAll(districts);
    }

    @Override
    public void delete(Districts districts) {
        repository.delete(districts);
    }

    @Override
    public void delete(Iterable<Districts> districts) {
        repository.deleteAll(districts);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
