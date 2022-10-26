package com.bsl.pojos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Point {
	@Value("30")
	private int x;
	@Value("40")
	private int y;
	public int getX() {
		return x;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
		System.out.println("Point object is created");
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}
