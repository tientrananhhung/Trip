package edu.poly.impl;

import edu.poly.entity.Users;
import edu.poly.repository.UserRepository;
import edu.poly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
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

//    @Override
//    public List<Users> getAllByDeleted(Boolean isDeleted) {
//        return repository.getAllByDeleted(isDeleted);
//    }

    @Override
    public Users getById(Integer id) {
        return repository.getById(id);
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

    @Override
    public Users login(String userName, String passWord) {
        Users users;
        try {
            users = repository.login(userName, passWord);
        } catch (Exception ex) {
            users = new Users();
        }
        return users;
    }

    @Override
    public List<Users> findAllByRole(Integer role) {
        return repository.findAllByRole(role);
    }

    @Override
    public Integer updateRoleUser(Integer role, Integer id) {
        return repository.updateRoleUser(role,id);
    }

    @Override
    public List<Users> findAllByDeleted(boolean deleted) {
        return repository.findAllByDeleted(deleted);
    }

    public static void main(String[] args) {
        UserImpl user = new UserImpl();
    }
}
