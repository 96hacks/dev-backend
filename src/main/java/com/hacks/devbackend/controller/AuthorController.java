package com.hacks.devbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hacks.devbackend.model.Author;
import com.hacks.devbackend.service.AuthorService;

@RestController
public class AuthorController {
	@Autowired
	private AuthorService authorService;

	public Author addAuthor(Author author) {
		return authorService.addAuthor(author);
	}
}