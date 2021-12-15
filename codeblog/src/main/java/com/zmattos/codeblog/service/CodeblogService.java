package com.zmattos.codeblog.service;

import com.zmattos.codeblog.model.Post;

import java.util.List;

public interface CodeblogService {

    List<Post> findAll();
    Post findById(long id);
    Post save (Post post);
}
