package com.myblog.blogapi.Repository;

import com.myblog.blogapi.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
