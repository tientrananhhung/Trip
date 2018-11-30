package edu.poly.service;

import edu.poly.entity.Orders;
import edu.poly.model.OrderDTO;

import java.util.List;
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

    public List<OrderDTO> getAllByDeletedAndPayment(Boolean isDeleted);

    public Orders getById(Integer id);

}
