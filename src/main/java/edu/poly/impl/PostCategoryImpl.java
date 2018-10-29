package edu.poly.impl;

import edu.poly.entity.PostCategory;
import edu.poly.repository.PostCategoryRepository;
import edu.poly.service.PostCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class PostCategoryImpl implements PostCategoryService {

    @Autowired
    PostCategoryRepository repository;

    public Iterable<PostCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<PostCategory> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public PostCategory save(PostCategory postCategory) {
        return repository.save(postCategory);
    }

    @Override
    public Iterable<PostCategory> save(Iterable<PostCategory> postCategories) {
        return repository.saveAll(postCategories);
    }

    @Override
    public PostCategory update(PostCategory postCategory) {
        return repository.save(postCategory);
    }

    @Override
    public Iterable<PostCategory> update(Iterable<PostCategory> postCategories) {
        return repository.saveAll(postCategories);
    }

    @Override
    public void delete(PostCategory postCategory) {
        repository.delete(postCategory);
    }

    @Override
    public void delete(Iterable<PostCategory> postCategories) {
        repository.deleteAll(postCategories);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public PostCategory getById(Integer id) {
        return repository.getById(id);
    }

}
