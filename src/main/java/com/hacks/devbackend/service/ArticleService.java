package com.hacks.devbackend.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.hacks.devbackend.model.Article;

public interface ArticleService {
	public ResponseEntity<Article> addArticle(Article article);

	public Article getArticleById(long id);

	public List<Article> getArticles();
}