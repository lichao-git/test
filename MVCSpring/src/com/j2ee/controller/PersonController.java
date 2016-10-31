package com.j2ee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.j2ee.service.personService;

@Controller
public class PersonController {
	
	@Autowired
	private personService personService ;
	
	public void savePerson() {
		personService.savePerson() ;
	}

}
