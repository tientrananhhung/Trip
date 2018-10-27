package edu.poly.repository;

import edu.poly.entity.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
    @Query("from Users where userName like :userName and passWord like :passWord")
    public Users login(@Param("userName") String userName, @Param("passWord") String passWord);
}
