package com.bsl.tester;

import java.util.Scanner;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Tester1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an expression");
		String expression=scanner.nextLine();
		
		ExpressionParser parser=new SpelExpressionParser();
		Expression exp=parser.parseExpression(expression);
		System.out.println(exp.getValue());
		System.out.println(parser.parseExpression("'shashank sharma'.toUpperCase()").getValue());
	}

}
