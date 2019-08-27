package com.hacks.devbackend.model;

import javax.persistence.Embeddable;

@Embeddable
public class Description {
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

}
