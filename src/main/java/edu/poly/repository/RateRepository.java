package edu.poly.repository;

import edu.poly.entity.Rates;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RateRepository extends CrudRepository<Rates, Integer> {
//    public Page<Rates> findByTourId(int tourId, Pageable pageable);

    @Query("select r from Rates r where tourId like :tourId")
    public Page<Rates> findAllByTourId(@Param("tourId") Integer tourId, Pageable pageable);
}