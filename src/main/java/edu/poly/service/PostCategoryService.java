package edu.poly.service;

import edu.poly.entity.PostCategorys;

import java.util.Optional;

public interface PostCategoryService {

    public Iterable<PostCategorys> findAll();

    public Optional<PostCategorys> findOne(Integer id);

    public PostCategorys save(PostCategorys postCategory);

    public Iterable<PostCategorys> save(Iterable<PostCategorys> postCategories);

    public PostCategorys update(PostCategorys postCategory);

    public Iterable<PostCategorys> update(Iterable<PostCategorys> postCategories);

    public void delete(PostCategorys postCategory);

    public void delete(Iterable<PostCategorys> postCategories);

    public void deleteById(Integer id);

//    public PostCategorys getById(Integer id);

//    public List<PostCategorys> getAllByDelete(boolean isDeleted);
}
