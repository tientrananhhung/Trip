package edu.poly.repository;

import edu.poly.entity.PostCategorys;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostCategoryRepository extends CrudRepository<PostCategorys, Integer> {

    public PostCategorys getById(Integer id);

    public List<PostCategorys> findAllByDeleted(Boolean isDeleted);

}
