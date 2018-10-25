package edu.poly.impl;

import edu.poly.entity.Orders;
import edu.poly.repository.OrderRepository;
import edu.poly.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class OrderImpl implements OrderService {

    @Autowired
    OrderRepository repository;

    public Iterable<Orders> findAll() {
        return repository.findAll();
    }
}
