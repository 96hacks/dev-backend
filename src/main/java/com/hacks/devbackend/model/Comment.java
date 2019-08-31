package com.hacks.devbackend.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OrderBy;
@Entity
public class Comment {
	@Id
	@OrderBy("id asc")
	private int id;
	private User user;
	private Date commentedDate;
	private String description;
	private int likes;
	private int disLikes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getCommentedDate() {
		return commentedDate;
	}

	public void setCommentedDate(Date commentedDate) {
		this.commentedDate = commentedDate;
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

	public int getDisLikes() {
		return disLikes;
	}

	public void setDisLikes(int disLikes) {
		this.disLikes = disLikes;
	}

}
