package com.bsl.pojos;

import com.bsl.contract.Shape;

public class Circle implements Shape{
	public void draw() {
	   System.out.println("Circle is draw");

	}

	@Override
	public String toString() {
		return "Circle [toString()=" + super.toString() + "]";
	}
	
	public Circle() {
		System.out.println("Object of Circle is created");
	}

}
