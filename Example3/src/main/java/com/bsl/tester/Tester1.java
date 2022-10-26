package com.bsl.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bsl.app.Application;
import com.bsl.config.MyConfiguration;
import com.bsl.pojos.Circle;

public class Tester1 {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
		
//     default behaviour of bean is always a singleton 		
		Application app1=context.getBean(Application.class);
		app1.getShape().draw();     
	}

}
