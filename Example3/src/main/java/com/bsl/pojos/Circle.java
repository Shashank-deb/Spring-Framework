package com.bsl.pojos;

import org.springframework.beans.factory.annotation.Autowired;

import com.bsl.contract.Shape;

public class Circle implements Shape{
	@Autowired
    private Point center;
   
	public void draw() {
		System.out.println("Circle is draw");
		System.out.println("X: "+this.center.getX());
		System.out.println("Y: "+this.center.getY());
		
		
	}

}
