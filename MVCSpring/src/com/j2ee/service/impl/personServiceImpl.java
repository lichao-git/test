package com.j2ee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j2ee.dao.PersonDao;
import com.j2ee.service.personService;

@Service
public class personServiceImpl implements personService {
	
	@Autowired
	private PersonDao personDao;

	@Override
	public void savePerson() {
		personDao.savePerson() ;
	}

}
