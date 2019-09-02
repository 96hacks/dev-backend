package com.hacks.devbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hacks.devbackend.model.Comment;
import com.hacks.devbackend.service.CommentService;

@RestController
public class CommentController {
	@Autowired
	private CommentService commentService;

	public int addComment(Comment comment) {
		return commentService.addComment(comment);
	}

	public List<Comment> getcomments() {
		return commentService.getComments();
	}
}
