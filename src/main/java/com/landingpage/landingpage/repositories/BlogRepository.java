package com.landingpage.landingpage.repositories;

import com.landingpage.landingpage.domain.blog.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long>{
}
