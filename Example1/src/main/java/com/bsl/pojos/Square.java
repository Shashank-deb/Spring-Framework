package com.bsl.pojos;

import com.bsl.contract.Shape;

public class Square implements Shape {
	public void draw() {
		System.out.println("Square is draw");
	}

	@Override
	public String toString() {
		return "Square [toString()=" + super.toString() + "]";
	}
	
	public Square() {
		System.out.println("Object of Sqaure is created");
	}

}
