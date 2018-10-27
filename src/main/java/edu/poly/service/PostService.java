package edu.poly.service;

import edu.poly.entity.Posts;

import java.util.Optional;

public interface PostService {

    public Iterable<Posts> findAll();

    public Optional<Posts> findOne(Integer id);

    public Posts save(Posts posts);

    public Iterable<Posts> save(Iterable<Posts> posts);

    public Posts update(Posts posts);

    public Iterable<Posts> update(Iterable<Posts> posts);

    public void delete(Posts posts);

    public void delete(Iterable<Posts> posts);

    public void deleteById(Integer id);

}
