package com.hacks.devbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hacks.devbackend.model.Comment;
import com.hacks.devbackend.service.CommentService;

@RestController
@RequestMapping(value = "articles/{article_id}/comments")
public class CommentController {
	@Autowired
	private CommentService commentService;

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public int addComment(Comment comment) {
		return commentService.addComment(comment);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/all")
	public List<Comment> getcomments() {
		return commentService.getComments();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{comment_id}")
	public Comment getcomment(@PathVariable("comment_id") int comment_id) {
		return commentService.getComment(comment_id);
	}
}
