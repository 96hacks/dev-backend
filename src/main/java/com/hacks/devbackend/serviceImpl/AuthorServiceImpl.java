package com.hacks.devbackend.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hacks.devbackend.model.Author;
import com.hacks.devbackend.repository.AuthorRepository;
import com.hacks.devbackend.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {
	@Autowired
	private AuthorRepository authorRepository;

	public Author addAuthor(Author author) {
		return authorRepository.save(author);
	}
}
