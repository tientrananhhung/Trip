package edu.poly.service;

import edu.poly.entity.PostCategory;

public interface PostCategoryService {
    Iterable<PostCategory> findAll();
}
