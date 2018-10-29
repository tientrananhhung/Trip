package edu.poly.service;

import edu.poly.entity.PostCategory;

import java.util.Optional;

public interface PostCategoryService {

    public Iterable<PostCategory> findAll();

    public Optional<PostCategory> findOne(Integer id);

    public PostCategory save(PostCategory postCategory);

    public Iterable<PostCategory> save(Iterable<PostCategory> postCategories);

    public PostCategory update(PostCategory postCategory);

    public Iterable<PostCategory> update(Iterable<PostCategory> postCategories);

    public void delete(PostCategory postCategory);

    public void delete(Iterable<PostCategory> postCategories);

    public void deleteById(Integer id);

    public PostCategory getById(Integer id);

}
