package com.myblog.blogapi.service;

import com.myblog.blogapi.Payload.CommentDto;
import com.myblog.blogapi.entities.Comment;

import java.util.List;

public interface CommentService {

    CommentDto createComment (long postId ,CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(long postId);

    CommentDto updateComment(long postId, long id, CommentDto commentDto);

    void deleteComment(long postId, long commentId);
}
