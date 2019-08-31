package com.hacks.devbackend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hacks.devbackend.model.Article;
import com.hacks.devbackend.repository.ArticleRepository;
@Service
public class ArticleService {
	@Autowired
	private ArticleRepository articleRepository;
	public int addArticle(Article article) {
		Article a=articleRepository.save(article);
		return a.getId();
	}
	public Article getArticleById(long id) {
		List<Article> articles=new ArrayList<Article>();
		articleRepository.findAll().forEach(item -> articles.add(item));
		return articles.stream().filter(a -> a.getId()==id).findAny().get();
	}

}
