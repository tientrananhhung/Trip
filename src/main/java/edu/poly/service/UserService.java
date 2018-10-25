package edu.poly.service;

import edu.poly.entity.Users;

import java.util.Optional;

public interface UserService {

    public Iterable<Users> findAll();

    public Optional<Users> findOne(Integer id);

    public Users save(Users users);

    public Iterable<Users> save(Iterable<Users> users);

    public Users update(Users users);

    public Iterable<Users> update(Iterable<Users> users);

    public void delete(Users users);

    public void delete(Iterable<Users> users);

    public void deleteById(Integer id);

}
