package com.hacks.devbackend.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@OrderBy("name asc")
	private String name;
	@OneToOne
	@PrimaryKeyJoinColumn
	private User author;
	private String category;
	private Date addedDate;
	private String intro;
	private int starsCount;
	//@OneToMany
	//@PrimaryKeyJoinColumn
	//private List<Comment> comments;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Description description;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public int getStarsCount() {
		return starsCount;
	}

	public void setStarsCount(int starsCount) {
		this.starsCount = starsCount;
	}

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	/*
	 * public List<Comment> getComments() { return comments; }
	 * 
	 * public void setComments(List<Comment> comments) { this.comments = comments; }
	 */

}
