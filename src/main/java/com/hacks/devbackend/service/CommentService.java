package com.hacks.devbackend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hacks.devbackend.model.Comment;
import com.hacks.devbackend.repository.CommentRepository;
@Service
public class CommentService {
	@Autowired
	private CommentRepository commentRepository;

	public int addComment(Comment comment) {
		return commentRepository.save(comment).getComment_id();
	}
	public Comment getComment(int id) {
		List<Comment> comments= new ArrayList<Comment>();
		commentRepository.findAll().forEach(item -> comments.add(item));
		return comments.stream().filter(item -> item.getComment_id()==id).findFirst().get();
	}
	public List<Comment> getComments() {
		List<Comment> comments=new ArrayList<Comment>();
		commentRepository.findAll().forEach(item -> comments.add(item));
		return comments;
	}

}
