package edu.poly.repository;

import edu.poly.entity.Orders;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface OrderRepository extends CrudRepository<Orders, Integer> {

//    @Modifying
    @Query("from Orders where payment = 1 OR payment = 2 AND deleted = :isDeleted")
    public List<Orders> getAllByDeletedAndPayment(@Param("isDeleted") Boolean isDeleted);

    public Orders getById(Integer id);
}
