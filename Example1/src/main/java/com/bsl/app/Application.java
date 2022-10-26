package com.bsl.app;

import com.bsl.contract.Shape;


public class Application {
	private Shape shape;
	
	public Shape getShape() {
		return shape;
	}
	
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}


	public Application(Shape shape) {
		this.shape = shape;
	}

}
