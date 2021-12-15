package com.zmattos.codeblog.service.serviceImpl;

import com.zmattos.codeblog.model.Post;
import com.zmattos.codeblog.repository.CodeBlogRepository;
import com.zmattos.codeblog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import java.util.List;

@Service
public class CodeblogServiceImpl implements CodeblogService {

    @Autowired
    CodeBlogRepository codeBlogRepository;

    @Override
    public List<Post> findAll() {
        return codeBlogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeBlogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeBlogRepository.save(post);
    }
    /*private Sort sortByIdAsc() {
        Sort id = new Sort(Sort.Direction.DESC, "id");
        return id;
    }*/
}
