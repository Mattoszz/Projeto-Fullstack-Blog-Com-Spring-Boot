package com.zmattos.codeblog.repository;

import com.zmattos.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeBlogRepository extends JpaRepository<Post, Long> {

}
