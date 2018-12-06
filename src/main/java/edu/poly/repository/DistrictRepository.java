package edu.poly.repository;

import edu.poly.entity.Districts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictRepository extends CrudRepository<Districts, Integer> {

    public List<Districts> findAllByDeleted(Boolean isDeleted);

    public Districts getById(Integer id);
}
