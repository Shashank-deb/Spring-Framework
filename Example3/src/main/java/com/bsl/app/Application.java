package com.bsl.app;

import com.bsl.contract.Shape;

public class Application {
	private Shape shape;

	public Application() {
		System.out.println("Application object is created");
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

}
