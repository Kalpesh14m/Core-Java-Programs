package com.java.kalpesh.constructor;

/*Parameterized Constructors ==>
 * Most often, you will need a constructor that accepts one or more parameters. Parameters are added to a constructor in the same way that they are added to a method, just declare them inside the parentheses after the constructor's name.
*/
//Java Program to demonstrate the use of the parameterized constructor.  
class ParameterizedConstructor {
	int id;
	String name;

	// creating a parameterized constructor
	ParameterizedConstructor(int i, String n) {
		id = i;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		// creating objects and passing values
		ParameterizedConstructor s1 = new ParameterizedConstructor(111, "Kalpesh");
		ParameterizedConstructor s2 = new ParameterizedConstructor(222, "Jayesh");
		// calling method to display the values of object
		s1.display();
		s2.display();
	}
}