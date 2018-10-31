package edu.poly.repository;

import edu.poly.entity.Users;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<Users, Integer> {

    @Query("from Users where userName like :userName and passWord like :passWord")
    public Users login(@Param("userName") String userName, @Param("passWord") String passWord);

    public List<Users> findAllByDeleted(boolean deleted);

    public Users getById(Integer id);

    public List<Users> findAllByRole(Integer role);

    @Modifying
    @Query("update Users set role = :role where id = :id")
    public Integer updateRoleUser(@Param("role") Integer role,@Param("id") Integer id);


}
