package edu.poly.impl;

import edu.poly.entity.Orders;
import edu.poly.repository.OrderRepository;
import edu.poly.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class OrderImpl implements OrderService {

    @Autowired
    OrderRepository repository;

    public Iterable<Orders> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Orders> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Orders save(Orders orders) {
        return repository.save(orders);
    }

    @Override
    public Iterable<Orders> save(Iterable<Orders> orders) {
        return repository.saveAll(orders);
    }

    @Override
    public Orders update(Orders orders) {
        return repository.save(orders);
    }

    @Override
    public Iterable<Orders> update(Iterable<Orders> orders) {
        return repository.saveAll(orders);
    }

    @Override
    public void delete(Orders orders) {
        repository.delete(orders);
    }

    @Override
    public void delete(Iterable<Orders> orders) {
        repository.deleteAll(orders);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }



    @Override
    public Orders getById(Integer id) {
        return repository.getById(id);
    }



}
