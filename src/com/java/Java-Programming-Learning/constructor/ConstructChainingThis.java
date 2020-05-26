/*
 * Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
 * Constructor chaining can be done in two ways:
 * 		Within same class: It can be done using this() keyword for constructors in same class
 * 		From base class: by using super() keyword to call constructor from the base class.
 */

package com.java.kalpesh.constructor;

//Java program to illustrate Constructor Chaining 
//within same class Using this() keyword 
class ConstructChainingThis {
	// default constructor 1
	// default constructor will call another constructor
	// using this keyword from same class
	ConstructChainingThis() {
		// calls constructor 2
		this(5);
		System.out.println("The Default constructor");
	}

	// parameterized constructor 2
	ConstructChainingThis(int x) {
		// calls constructor 3
		this(5, 15);
		System.out.println(x);
	}

	// parameterized constructor 3
	ConstructChainingThis(int x, int y) {
		System.out.println(x * y);
	}

	public static void main(String args[]) {
		// invokes default constructor first
		new ConstructChainingThis();
	}
}
