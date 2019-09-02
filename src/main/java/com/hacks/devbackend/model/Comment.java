package com.hacks.devbackend.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comment_id", updatable = false, nullable = false)
	private int comment_id;
	@JoinColumn(name = "article_id")
	@OneToOne
	private Article article;// references article(article_id)
	@JoinColumn(name = "user_id")
	@OneToOne
	private User user;// references user(user_id)
	private Date commented_date;
	private String description;
	private int likes;
	private int dis_likes;

	public int getComment_id() {
		return comment_id;
	}

	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getCommented_date() {
		return commented_date;
	}

	public void setCommented_date(Date commented_date) {
		this.commented_date = commented_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDis_likes() {
		return dis_likes;
	}

	public void setDis_likes(int dis_likes) {
		this.dis_likes = dis_likes;
	}

}
