package com.bsl.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bsl.contract.Shape;


@Component
public class Application {
	@Autowired
	private Shape shape;
	
	public Shape getShape() {
		return shape;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	

}
