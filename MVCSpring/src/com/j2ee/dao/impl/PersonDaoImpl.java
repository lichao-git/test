package com.j2ee.dao.impl;

import org.springframework.stereotype.Repository;

import com.j2ee.dao.PersonDao;

@Repository
public class PersonDaoImpl implements PersonDao {

	@Override
	public void savePerson() {
		System.out.println("save person");
	}

}
