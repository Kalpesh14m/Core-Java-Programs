package com.java.kalpesh.nestedclasses;

class Outer_Demo {
	int num;
	private String name = "Kalpesh";

	// inner class
	private class Inner_Demo {
		public void print() {
			System.out.println("This is an inner class in Inner_Demo private class");
		}
	}

	public class Inner_Demo_Name {
		public String getName() {
			System.out
					.println("In inner class of Inner_Demo_Name public class to return private instance variable name");
			return name;
		}
	}

	// Accessing he inner class from the method within
	void display_Inner() {
		Inner_Demo inner = new Inner_Demo();
		inner.print();
	}
}

public class InnerClass {
	public static void main(String args[]) {
		// Instantiating the outer class
		Outer_Demo outer = new Outer_Demo();

		// Accessing the display_Inner() method.
		outer.display_Inner();

		Outer_Demo.Inner_Demo_Name name = outer.new Inner_Demo_Name();
		System.out.println(name.getName());
	}
}
/*
 * In Java, just like methods, variables of a class too can have another class
 * as its member. Writing a class within another is allowed in Java. The class
 * written within is called the nested class, and the class that holds the inner
 * class is called the outer class. Nested classes are divided into two types −
 * 
 * Inner Classes (Non-static nested classes) − These are the non-static members
 * of a class. Inner classes are a security mechanism in Java. We know a class
 * cannot be associated with the access modifier private, but if we have the
 * class as a member of other class, then the inner class can be made private.
 * And this is also used to access the private members of a class.
 * 
 * Inner classes are of three types depending on how and where you define them.
 * They are −
 * 
 * Inner Class Method-local Inner Class Anonymous Inner Class
 * 
 * Inner Class
 * 
 * Creating an inner class is quite simple. You just need to write a class
 * within a class. Unlike a class, an inner class can be private and once you
 * declare an inner class private, it cannot be accessed from an object outside
 * the class. Static nested classes − These are the static members of a class.
 */