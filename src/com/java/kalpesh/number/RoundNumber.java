package com.java.kalpesh.number;

public class RoundNumber {
	public static void main(String args[]) {
		double d = 100.675;
		double e = 100.500;
		float f = 100;
		float g = 90f;

		System.out.println(Math.round(d));
		System.out.println(Math.round(e));
		System.out.println(Math.round(f));
		System.out.println(Math.round(g));
	}
}
/*
 * The method round returns the closest long or int, as given by the methods
 * return type.
 * 
 * Parameters Here is the detail of parameters −
 * 
 * d − A double or float primitive data type.
 * 
 * f − A float primitive data type.
 * 
 * Return Value This method returns the closest long or int, as indicated by the
 * method's return type, to the argument.
 */