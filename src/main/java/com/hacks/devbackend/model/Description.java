package com.hacks.devbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Description {
	@Id
	private int id;
	private String points;
	private String paragraphs;

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public String getParagraphs() {
		return paragraphs;
	}

	public void setParagraphs(String paragraphs) {
		this.paragraphs = paragraphs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
