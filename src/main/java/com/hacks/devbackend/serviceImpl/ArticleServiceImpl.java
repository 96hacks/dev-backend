package com.hacks.devbackend.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hacks.devbackend.model.Article;
import com.hacks.devbackend.repository.ArticleRepository;
import com.hacks.devbackend.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleRepository articleRepository;

	@Transactional
	public int addArticle(Article article) {
		return articleRepository.save(article).getArticle_id();
	}

	@Transactional
	public Article getArticleById(long id) {
		List<Article> articles = new ArrayList<Article>();
		articleRepository.findAll().forEach(item -> articles.add(item));
		return articles.stream().filter(a -> a.getArticle_id() == id).findAny().get();
	}

	@Transactional
	public List<Article> getArticles() {
		List<Article> articles = new ArrayList<Article>();
		articleRepository.findAll().forEach(item -> articles.add(item));
		return articles;
	}
}
