package com.hacks.devbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hacks.devbackend.model.Article;
import com.hacks.devbackend.service.ArticleService;

@RestController
@RequestMapping(value = "articles")
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	@RequestMapping(method = RequestMethod.POST,value = "/add")
	@ResponseBody
	public ResponseEntity<Article> addArticle(@RequestBody Article article) {
		return articleService.addArticle(article);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Article getArticle(@PathVariable("id") int id) {
		System.out.println("article id:" + id);
		return articleService.getArticleById(id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/all")
	public List<Article> getArticles() {
		return articleService.getArticles();
	}

}
