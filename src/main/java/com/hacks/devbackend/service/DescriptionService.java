package com.hacks.devbackend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hacks.devbackend.model.Description;
import com.hacks.devbackend.repository.DescriptionRepository;
@Service
public class DescriptionService {
	@Autowired
	private DescriptionRepository descriptionRepository;

	public int addDescription(Description description) {
		return descriptionRepository.save(description).getDescription_id();
	}

	public Description getDescription(int id) {
		List<Description> descriptions = new ArrayList<Description>();
		descriptionRepository.findAll().forEach(item -> descriptions.add(item));
		return descriptions.stream().filter(item -> item.getDescription_id() == id).findAny().get();
	}

}
