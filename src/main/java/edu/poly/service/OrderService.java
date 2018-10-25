package edu.poly.service;

import edu.poly.entity.Orders;

public interface OrderService {
    Iterable<Orders> findAll();
}
