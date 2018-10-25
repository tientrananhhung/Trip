package edu.poly.repository;

import edu.poly.entity.PostCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCategoryRepository extends CrudRepository<PostCategory, Integer> {

}
