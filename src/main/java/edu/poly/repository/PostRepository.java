package edu.poly.repository;

import edu.poly.entity.Posts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Posts, Integer> {

    public Posts getById(Integer id);

    public List<Posts> findAllByDeleted(boolean deleted);

    public Page findAll(Pageable pageable);

}
