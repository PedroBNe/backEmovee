package com.landingpage.landingpage.controllers;

import com.landingpage.landingpage.domain.blog.Blog;
import com.landingpage.landingpage.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public List<Blog> getAllBlogs() {
        return blogService.findAll();
    }
}
