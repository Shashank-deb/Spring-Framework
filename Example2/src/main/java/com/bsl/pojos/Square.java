package com.bsl.pojos;

import org.springframework.stereotype.Component;

import com.bsl.contract.Shape;

@Component("shape")
public class Square implements Shape {

	public void draw() {
		System.out.println("Square is draw");
		
	}

}
