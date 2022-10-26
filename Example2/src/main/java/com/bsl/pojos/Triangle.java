package com.bsl.pojos;

import org.springframework.stereotype.Component;

import com.bsl.contract.Shape;

@Component
public class Triangle implements Shape {

	public void draw() {
		System.out.println("Triangle is draw");

	}

}
