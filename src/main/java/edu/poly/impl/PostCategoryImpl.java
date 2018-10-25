package edu.poly.impl;

import edu.poly.entity.PostCategory;
import edu.poly.repository.PostCategoryRepository;
import edu.poly.service.PostCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class PostCategoryImpl implements PostCategoryService {

    @Autowired
    PostCategoryRepository repository;

    public Iterable<PostCategory> findAll() {
        return repository.findAll();
    }
}
