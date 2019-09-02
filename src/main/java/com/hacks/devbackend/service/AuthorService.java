package com.hacks.devbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hacks.devbackend.model.Author;
import com.hacks.devbackend.repository.AuthorRepository;
@Service
public class AuthorService {
	@Autowired
	private AuthorRepository authorRepository;

	public Author addAuthor(Author author) {
		return authorRepository.save(author);
	}

}
