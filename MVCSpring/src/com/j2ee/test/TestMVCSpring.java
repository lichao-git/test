package com.j2ee.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.j2ee.controller.PersonController;

public class TestMVCSpring {
	
	@Test
	public void testMVCSpring() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml") ;
		PersonController personController = (PersonController) context.getBean("personController") ;
		personController.savePerson() ;
	}

}
