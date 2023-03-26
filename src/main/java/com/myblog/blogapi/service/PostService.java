package com.myblog.blogapi.service;

import com.myblog.blogapi.Payload.PostDto;
import com.myblog.blogapi.Payload.PostResponse;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostResponse getAllPost(int pageNo, int pageSize , String sortBy ,String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePost(long id);
}
