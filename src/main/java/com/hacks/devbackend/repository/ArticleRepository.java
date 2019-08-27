package com.hacks.devbackend.repository;

import org.springframework.data.repository.CrudRepository;

import com.hacks.devbackend.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Integer> {

}
