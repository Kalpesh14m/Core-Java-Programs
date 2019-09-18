package com.java.kalpesh.number;

public class ToStringNumber {
	public static void main(String args[]) {
		Integer x = 5;
		String a = x.toString();
		System.out.println(a);
		System.out.println(Integer.toString(12));
		System.out.println(a instanceof String);
	}
}
/*
 * The method is used to get a String object representing the value of the
 * Number Object.
 * 
 * If the method takes a primitive data type as an argument, then the String
 * object representing the primitive data type value is returned.
 * 
 * If the method takes two arguments, then a String representation of the first
 * argument in the radix specified by the second argument will be returned.
 * 
 * Parameters Here is the detail of parameters −
 * 
 * i − An int for which string representation would be returned.
 * 
 * Return Value toString() − This returns a String object representing the value
 * of this Integer.
 * 
 * toString(int i) − This returns a String object representing the specified
 * integer.
 */