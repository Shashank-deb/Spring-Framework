package com.bsl.utils;

import java.util.Scanner;

public class Input {
	Scanner scanner=new Scanner(System.in);
	
	
	public int getInt() {
		System.out.println("Enter an Integer: ");
		return scanner.nextInt();
	}
	
	public double getDouble() {
		System.out.println("Enter an Double: ");
		return scanner.nextDouble();
	}
	
	public String getString() {
		System.out.println("Enter an String: ");
		return scanner.next();
	}
	
	 
	

}
