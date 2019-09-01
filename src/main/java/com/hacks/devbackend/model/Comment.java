package com.hacks.devbackend.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comment_id", updatable = false, nullable = false)
	private int comment_id;
	private int article_id;// references article(article_id)
	private String user_id;// references user(user_id)
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

	public int getArticle_id() {
		return article_id;
	}

	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
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
