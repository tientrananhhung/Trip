package edu.poly.repository;

import edu.poly.entity.Partners;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepository extends CrudRepository<Partners, Integer> {

}
