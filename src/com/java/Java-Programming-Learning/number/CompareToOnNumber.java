package com.java.kalpesh.number;

public class CompareToOnNumber {
	public static void main(String args[]) {
		Integer x = 5;
		int a = 10;
		System.out.println(x.compareTo(3));
		System.out.println(x.compareTo(5));
		System.out.println(x.compareTo(8));
		// System.out.println(a.compareTo(8));// Can not invoke compareTo(int) on
		// primitive type int

	}
}

/*
 *
 * Parameters Here is the detail of parameters −
 * 
 * referenceName − This could be a Byte, Double, Integer, Float, Long, or Short.
 * 
 * Return Value If the Integer is equal to the argument then 0 is returned. If
 * the Integer is less than the argument then -1 is returned. If the Integer is
 * greater than the argument then 1 is returned.
 */
