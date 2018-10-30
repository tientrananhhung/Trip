package edu.poly.repository;

import edu.poly.entity.PostCategorys;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostCategoryRepository extends CrudRepository<PostCategorys, Integer> {

    public PostCategorys getById(Integer id);

//    @Query("from PostCategory where Is_deleted = :isDeleted")
//    public List<PostCategorys> getAllByDeleted(@Param("isDeleted") boolean isDeleted);

}
