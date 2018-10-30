package edu.poly.impl;

import edu.poly.entity.PostCategorys;
import edu.poly.repository.PostCategoryRepository;
import edu.poly.service.PostCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class PostCategoryImpl implements PostCategoryService {

    @Autowired
    PostCategoryRepository repository;

    public Iterable<PostCategorys> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<PostCategorys> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public PostCategorys save(PostCategorys postCategory) {
        return repository.save(postCategory);
    }

    @Override
    public Iterable<PostCategorys> save(Iterable<PostCategorys> postCategories) {
        return repository.saveAll(postCategories);
    }

    @Override
    public PostCategorys update(PostCategorys postCategory) {
        return repository.save(postCategory);
    }

    @Override
    public Iterable<PostCategorys> update(Iterable<PostCategorys> postCategories) {
        return repository.saveAll(postCategories);
    }

    @Override
    public void delete(PostCategorys postCategory) {
        repository.delete(postCategory);
    }

    @Override
    public void delete(Iterable<PostCategorys> postCategories) {
        repository.deleteAll(postCategories);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public PostCategorys getById(Integer id) {
        return repository.getById(id);
    }

    @Override
    public List<PostCategorys> getAllByDelete(boolean isDeleted) {
        return repository.getAllByDeleted(isDeleted);
    }

}
