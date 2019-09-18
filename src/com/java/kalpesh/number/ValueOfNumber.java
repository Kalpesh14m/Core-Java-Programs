package com.java.kalpesh.number;

public class ValueOfNumber {
	public static void main(String args[]) {
		Integer x = Integer.valueOf(9);
		Double c = Double.valueOf(5);
		Float a = Float.valueOf("80");
		Integer b = Integer.valueOf("444", 16);

		System.out.println(x);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}
}

/*
 * The valueOf method returns the relevant Number Object holding the value of
 * the argument passed. The argument can be a primitive data type, String, etc.
 * 
 * This method is a static method. The method can take two arguments, where one
 * is a String and the other is a radix.
 * 
 * Parameters Here is the detail of parameters −
 * 
 * i − An int for which Integer representation would be returned.
 * 
 * s − A String for which Integer representation would be returned.
 * 
 * radix − This would be used to decide the value of returned Integer based on
 * the passed String.
 * 
 * Return Value valueOf(int i) − This returns an Integer object holding the
 * value of the specified primitive.
 * 
 * valueOf(String s) − This returns an Integer object holding the value of the
 * specified string representation.
 * 
 * valueOf(String s, int radix) − This returns an Integer object holding the
 * integer value of the specified string representation, parsed with the value
 * of radix.
 */