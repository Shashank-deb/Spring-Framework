package com.bsl.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bsl.pojos.Person;

public class Tester2 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Person p1=(Person)context.getBean(Person.class);
		System.out.println(p1);
		
	}

}
