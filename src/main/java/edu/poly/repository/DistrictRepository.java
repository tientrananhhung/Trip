package edu.poly.repository;

import edu.poly.model.Districts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictRepository extends CrudRepository<Districts, Integer> {

    @Query("from  Districts where is_deleted = :isDeleted")
    public List<Districts> getAllByDeleted(@Param("isDeleted") boolean isDeleted);

    public Districts getById(Integer id);
}
