package edu.poly.repository;

import edu.poly.entity.Services;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends CrudRepository<Services, Integer> {

    @Query("FROM Services WHERE id = :id")
    public Services findServiceById(@Param("id") Integer id);
}
