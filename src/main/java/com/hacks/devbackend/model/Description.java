package com.hacks.devbackend.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "description")
public class Description {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "description_id", updatable = false, nullable = false)
	private int description_id;
	@JoinColumn(name = "article_id")
	@OneToOne
	private Article article;// foreign key references article(article_id)
	private Blob data;
	private String image_id;

	public int getDescription_id() {
		return description_id;
	}

	public void setDescription_id(int description_id) {
		this.description_id = description_id;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Blob getData() {
		return data;
	}

	public void setData(Blob data) {
		this.data = data;
	}

	public String getImage_id() {
		return image_id;
	}

	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}
}
