package com.mss.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mss.app.dto.Person;
import com.mss.app.repository.PersonRepository;

@RestController("/demo")
public class Controller {

	@Autowired
	PersonRepository personRepository;

	@PostMapping("/addPerson")
	private Person addPerson(@RequestBody Person person) {
		personRepository.save(person);
		return person;
	}
}
