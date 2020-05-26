package com.java.kalpesh.number;

public class RandomNumber {
	public static void main(String args[]) {
		System.out.println(Math.random());
		System.out.println(Math.random());

		int max = 5;
		int min = 2;
		double x = (int) (Math.random() * ((max - min) + 1)) + min;

		System.out.println(x);

	}
}
/*
 * The method is used to generate a random number between 0.0 and 1.0. The range
 * is: 0.0 =< Math.random < 1.0. Different ranges can be achieved by using
 * arithmetic operations.
 * 
 * Parameters Here is the detail of parameters −
 * 
 * This is a default method and accepts no parameter. Return Value This method
 * returns a double.
 */