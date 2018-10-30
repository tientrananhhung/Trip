package edu.poly.service;

import edu.poly.model.Orders;

import java.util.Optional;

public interface OrderService {

    public Iterable<Orders> findAll();

    public Optional<Orders> findOne(Integer id);

    public Orders save(Orders orders);

    public Iterable<Orders> save(Iterable<Orders> orders);

    public Orders update(Orders orders);

    public Iterable<Orders> update(Iterable<Orders> orders);

    public void delete(Orders orders);

    public void delete(Iterable<Orders> orders);

    public void deleteById(Integer id);

}
