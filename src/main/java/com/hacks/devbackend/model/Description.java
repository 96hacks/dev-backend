package com.hacks.devbackend.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "description")
public class Description {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "description_id", updatable = false, nullable = false)
	private String description_id;
	private int article_id;//foreign key references article(article_id)
	private Blob data;
	private String image_id;
	
	public String getDescription_id() {
		return description_id;
	}
	public void setDescription_id(String description_id) {
		this.description_id = description_id;
	}
	public int getArticle_id() {
		return article_id;
	}
	public void setArticle_id(int article_id) {
		this.article_id = article_id;
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
