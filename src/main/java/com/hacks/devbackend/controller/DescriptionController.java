package com.hacks.devbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hacks.devbackend.model.Description;
import com.hacks.devbackend.service.DescriptionService;

@RestController
@RequestMapping(value = "article/description")
public class DescriptionController {
	@Autowired
	private DescriptionService descriptionService;
	@RequestMapping(method = RequestMethod.POST,value = "/add")
	public int addDescription(Description description) {
		return descriptionService.addDescription(description);
	}
	@RequestMapping(method = RequestMethod.GET,value = "/{id}")
	public Description getDescription(int id) {
		return descriptionService.getDescription(id);
	}
}
