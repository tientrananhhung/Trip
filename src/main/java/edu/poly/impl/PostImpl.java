package edu.poly.impl;

import edu.poly.entity.Posts;
import edu.poly.repository.PostRepository;
import edu.poly.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class PostImpl implements PostService {

    @Autowired
    PostRepository repository;

    public Iterable<Posts> findAll() {
        return repository.findAll();
    }
}
