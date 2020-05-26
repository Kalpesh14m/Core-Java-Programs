package com.java.kalpesh.number;

public class NumberDemo {
	public static void main(String args[]) {
		Integer x = 5; // boxes int to an Integer object
		System.out.println(x instanceof Integer);
		x = x + 10; // unboxes the Integer to a int
		System.out.println(x instanceof Integer);
		System.out.println(x);
	}
}
/*
 * Normally, when we work with Numbers, we use primitive data types such as
 * byte, int, long, double, etc.
 * 
 * However, in development, we come across situations where we need to use
 * objects instead of primitive data types. In order to achieve this, Java
 * provides wrapper classes.
 * 
 * All the wrapper classes (Integer, Long, Byte, Double, Float, Short) are
 * subclasses of the abstract class Number.
 * 
 * The object of the wrapper class contains or wraps its respective primitive
 * data type. Converting primitive data types into object is called boxing, and
 * this is taken care by the compiler. Therefore, while using a wrapper class
 * you just need to pass the value of the primitive data type to the constructor
 * of the Wrapper class.
 * 
 * And the Wrapper object will be converted back to a primitive data type, and
 * this process is called unboxing. The Number class is part of the java.lang
 * package.
 */
