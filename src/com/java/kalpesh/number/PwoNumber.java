package com.java.kalpesh.number;

public class PwoNumber {
	public static void main(String args[]) {
		double x = 11.635;
		double y = 2.76;

		int a = 2;
		int b = 3;
		System.out.printf("The value of e is %.4f%n", Math.E);
		System.out.printf("pow(%.3f, %.3f) is %.3f%n", x, y, Math.pow(x, y));
		System.out.printf("pow(" + a + ", " + b + ") is " + Math.pow(a, b) + "\n");

	}
}
/*
 * The method returns the value of the first argument raised to the power of the
 * second argument.
 * 
 * 
 * Parameters Here is the detail of parameters −
 * 
 * base − Any primitive data type.
 * 
 * exponenet − Any primitive data type.
 * 
 * Return Value This method returns the value of the first argument raised to
 * the power of the second argument.
 */