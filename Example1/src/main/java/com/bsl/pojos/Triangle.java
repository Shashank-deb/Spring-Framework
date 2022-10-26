package com.bsl.pojos;

import com.bsl.contract.Shape;

public class Triangle implements Shape {
	private String name;
	private int height;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Triangle() {
		this.name = null;
		this.height = 0;

	}

	public Triangle(String name) {
		this.name = name;
	}

	public Triangle(int height) {
		this.height = height;
	}

	public Triangle(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public void draw() {
		System.out.println("Triangle is draw");
		System.out.println("Name: " + this.name);
		System.out.println("Height: " + this.height);

	}

}
