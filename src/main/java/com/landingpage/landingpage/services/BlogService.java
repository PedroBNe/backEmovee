package com.landingpage.landingpage.services;

import com.landingpage.landingpage.domain.blog.Blog;
import com.landingpage.landingpage.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public List<Blog> findAll() {
        return blogRepository.findAll();
    }
}
