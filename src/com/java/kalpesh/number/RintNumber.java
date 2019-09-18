package com.java.kalpesh.number;

public class RintNumber {
	public static void main(String args[]) {
		double d = 100.675;
		double e = 100.500;
		double f = 100.200;

		System.out.println(Math.rint(d));
		System.out.println(Math.rint(e));
		System.out.println(Math.rint(f));
	}
}
/*
 * The method rint returns the integer that is closest in value to the argument.
 * 
 * Parameters Here is the detail of parameters −
 * 
 * d − it accepts a double value as parameter.
 * 
 * Return Value This method returns the integer that is closest in value to the
 * argument. Returned as a double.
 */