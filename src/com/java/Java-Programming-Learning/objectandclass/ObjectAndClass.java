/*3 Ways to initialize object
 * There are 3 ways to initialize object in Java.
 * 1. By reference variable
 * 2. By method
 * 3. By constructor*/
package com.java.kalpesh.objectandclass;

//Java Program to illustrate how to define a class and fields  
//Defining a Student class.  
class ObjectAndClass {
	// defining fields
	int id;// field or data member or instance variable
	String name;

	// creating main method inside the Student class
	public static void main(String args[]) {
		// Creating an object or instance
		ObjectAndClass s1 = new ObjectAndClass();// creating an object of
													// Student
		// Printing values of the object
		System.out.println(s1.id);// accessing member through reference variable
		System.out.println(s1.name);
	}
}