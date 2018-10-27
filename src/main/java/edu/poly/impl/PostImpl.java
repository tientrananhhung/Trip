package edu.poly.impl;

import edu.poly.entity.Posts;
import edu.poly.repository.PostRepository;
import edu.poly.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class PostImpl implements PostService {

    @Autowired
    PostRepository repository;

    public Iterable<Posts> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Posts> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Posts save(Posts posts) {
        return repository.save(posts);
    }

    @Override
    public Iterable<Posts> save(Iterable<Posts> posts) {
        return repository.saveAll(posts);
    }

    @Override
    public Posts update(Posts posts) {
        return repository.save(posts);
    }

    @Override
    public Iterable<Posts> update(Iterable<Posts> posts) {
        return repository.saveAll(posts);
    }

    @Override
    public void delete(Posts posts) {
        repository.delete(posts);
    }

    @Override
    public void delete(Iterable<Posts> posts) {
        repository.deleteAll(posts);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
