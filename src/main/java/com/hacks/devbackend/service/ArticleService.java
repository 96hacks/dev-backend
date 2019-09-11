package com.hacks.devbackend.service;

import java.util.List;
import com.hacks.devbackend.model.Article;

public interface ArticleService {
	public int addArticle(Article article);

	public Article getArticleById(long id);

	public List<Article> getArticles();
}