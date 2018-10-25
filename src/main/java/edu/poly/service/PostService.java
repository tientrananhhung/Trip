package edu.poly.service;

import edu.poly.entity.Posts;

public interface PostService {
    Iterable<Posts> findAll();
}
