package com.hacks.devbackend.model;

import java.util.Date;

import javax.persistence.Embeddable;
@Embeddable
public class Comment {
	private String commentor;
	private Date commentedDate;
	private String description;
	private int likes;
	private int disLikes;

	public String getCommentor() {
		return commentor;
	}

	public void setCommentor(String commentor) {
		this.commentor = commentor;
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
