package com.bsl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.bsl.app.Application;
import com.bsl.contract.Shape;
import com.bsl.pojos.Circle;
import com.bsl.pojos.Square;
import com.bsl.pojos.Triangle;

@Configuration
@ComponentScan("com.bsl")
public class MyConfiguration {
	
	
	@Bean
	public Shape circle() {
		Circle c1=new Circle();
		return c1;
	}
	
	
	@Bean
	public Shape square() {
		Square s1=new Square();
		return s1;
	}
	
	@Bean
	public Shape  triangle() {
		Triangle t1=new Triangle();
		return t1;
	}
	
	
	@Bean
	//used when we need a seperate bean 
	@Scope("prototype")
	public Application application() {
		Application a1=new Application();
		a1.setShape(circle());
		return a1;
	}

}
