package com.java.kalpesh.operators;

public class LogicalOperators {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		System.out.println("a : " + a);
		System.out.println("b : " + b);

		System.out.println("a&&b : " + (a && b));
		System.out.println("a||b : " + (a || b));
		System.out.println("!(a&&b) : " + !(a && b));
		System.out.println("!(a||b) : " + !(a || b));

	}
}
