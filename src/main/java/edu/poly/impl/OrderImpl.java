package edu.poly.impl;

import edu.poly.entity.Orders;
import edu.poly.model.OrderDTO;
import edu.poly.repository.OrderRepository;
import edu.poly.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
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
    public List<OrderDTO> getAllByDeletedAndPayment(Boolean isDeleted) {
        List<Orders> list = repository.getAllByDeletedAndPayment(isDeleted);
        List<OrderDTO> newlist = new ArrayList<OrderDTO>();
        for(Orders orders:list){
           OrderDTO od = new OrderDTO();
           od.setOrderID(orders.getId());
            od.setCustomerName(orders.getUsersByUserId().getName());
            od.setServiceName(orders.getServicesByServiceId().getName());
            od.setUserEmail(orders.getUsersByUserId().getEmail());
            od.setPurchased(orders.getPurchased());
            od.setOrderDate(orders.getCreatedAt());
            od.setPayment(orders.getPayment());
            String[] arRules = orders.getData().split("\\,");
            String note = arRules[0].split("\\:")[1];
            od.setNote(note);
            String phoneUser =  arRules[1].split("\\:")[1];
            od.setPhoneUser(phoneUser);
            String serviceDate =  arRules[3].split("\\:")[1];
            od.setServiceDate(serviceDate);
            String totalPrice = arRules[4].split("\\:")[1];
            od.setTotalPrice(totalPrice);
            String totalPriceAfter = arRules[5].split("\\:")[1];
            od.setTotalPriceAfter(totalPriceAfter);
            newlist.add(od);
        }
        return newlist;
    }

    @Override
    public Orders getById(Integer id) {
        return repository.getById(id);
    }

}
