package com.hacks.devbackend.service;

import java.util.List;
import com.hacks.devbackend.model.Comment;

public interface CommentService {
	public int addComment(Comment comment);

	public Comment getComment(int id);

	public List<Comment> getComments();
}
