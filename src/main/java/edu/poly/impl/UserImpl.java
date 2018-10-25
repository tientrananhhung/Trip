package edu.poly.impl;

import edu.poly.entity.Users;
import edu.poly.repository.UserRepository;
import edu.poly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class UserImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public Iterable<Users> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Users> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Users save(Users users) {
        return repository.save(users);
    }

    @Override
    public Iterable<Users> save(Iterable<Users> users) {
        return repository.saveAll(users);
    }

    @Override
    public Users update(Users users) {
        return repository.save(users);
    }

    @Override
    public Iterable<Users> update(Iterable<Users> users) {
        return repository.saveAll(users);
    }

    @Override
    public void delete(Users users) {
        repository.delete(users);
    }

    @Override
    public void delete(Iterable<Users> users) {
        repository.deleteAll(users);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
