package com.java.kalpesh.number;

public class ParseIntNumber {
	public static void main(String args[]) {
		int x = Integer.parseInt("9");
		double c = Double.parseDouble("5");
		int b = Integer.parseInt("444", 16);

		System.out.println(x);
		System.out.println(c);
		System.out.println(b);
	}
}
/*
 * This method is used to get the primitive data type of a certain String.
 * parseXxx() is a static method and can have one argument or two.
 * 
 * Parameters Here is the detail of parameters −
 * 
 * s − This is a string representation of decimal.
 * 
 * radix − This would be used to convert String s into integer.
 * 
 * Return Value parseInt(String s) − This returns an integer (decimal only).
 * 
 * parseInt(int i) − This returns an integer, given a string representation of
 * decimal, binary, octal, or hexadecimal (radix equals 10, 2, 8, or 16
 * respectively) numbers as input.
 */