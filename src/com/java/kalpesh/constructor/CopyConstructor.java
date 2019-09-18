/*
 * There is no copy constructor in Java. 
 * However, we can copy the values from one object to another like copy constructor in C++.
 * There are many ways to copy the values of one object into another in Java. They are:
 * 		By constructor
 * 		By assigning the values of one object into another
 * 		By clone() method of Object class
 */

package com.java.kalpesh.constructor;

//Java program to initialize the values from one object to another object.  
class CopyConstructor {
	int id;
	String name;

	// constructor to initialize integer and string
	CopyConstructor(int i, String n) {
		id = i;
		name = n;
	}

	// constructor to initialize another object
	CopyConstructor(CopyConstructor s) {
		id = s.id;
		name = s.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		CopyConstructor s1 = new CopyConstructor(111, "Karan");
		CopyConstructor s2 = new CopyConstructor(s1);
		// Note that following doesn't involve a copy constructor call as
		// non-primitive variables are just references.
		CopyConstructor s3 = s1;

		s1.display();
		s2.display();

		s3.display();

	}
}