package com.hacks.devbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hacks.devbackend.model.Description;
import com.hacks.devbackend.service.DescriptionService;

@RestController
public class DescriptionController {
	@Autowired
	private DescriptionService descriptionService;

	public int addDescription(Description description) {
		return descriptionService.addDescription(description);
	}

	public Description getDescription(int id) {
		return descriptionService.getDescription(id);
	}
}
