package edu.poly.repository;

import edu.poly.entity.Partners;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartnerRepository extends CrudRepository<Partners, Integer> {

    public List<Partners> findAllByDeleted(boolean deleted);

    public Partners getById(Integer id);

}
