package edu.poly.repository;

import edu.poly.entity.Tours;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TourRepository extends CrudRepository<Tours, Integer> {
    List<Tours> findAllByDeleted(Boolean isDeleted);
    Tours getById(Integer id);
}
