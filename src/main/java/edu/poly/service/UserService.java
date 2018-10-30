package edu.poly.service;

import edu.poly.entity.Users;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public Iterable<Users> findAll();

    public List<Users> getAllByDeleted(boolean isDeleted);

    public Users getById(Integer id);

    public Optional<Users> findOne(Integer id);

    public Users save(Users users);

    public Iterable<Users> save(Iterable<Users> users);

    public Users update(Users users);

    public Iterable<Users> update(Iterable<Users> users);

    public void delete(Users users);

    public void delete(Iterable<Users> users);

    public void deleteById(Integer id);

    public Users login(String userName, String passWord);

    public List<Users> findAllByRole(Integer role);

}
