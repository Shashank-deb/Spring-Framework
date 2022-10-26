package com.bsl.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bsl.app.Application;

public class Tester1 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Application app=context.getBean(Application.class);
		app.getShape().draw();
		
	}

}
