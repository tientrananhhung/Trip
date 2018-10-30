package edu.poly.repository;

import edu.poly.entity.PostCategorys;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCategoryRepository extends CrudRepository<PostCategorys, Integer> {

//    public PostCategorys getById(Integer id);
//
//    @Query("from  PostCategory  where Is_deleted = :isDeleted")
//    public List<PostCategorys> getAllByDeleted(@Param("isDeleted") boolean isDeleted);

}
