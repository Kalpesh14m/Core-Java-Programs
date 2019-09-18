/*If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
 * Rules for Java Method Overriding:
 * 	1. The method must have the same name as in the parent class
 * 	2. The method must have the same parameter as in the parent class.
 * 	3. There must be an IS-A relationship (inheritance).
 *
 * 1) Why can we not override static method?
 * 	==> It is because the static method is bound with class whereas instance method is bound with an object. 
 * Static belongs to the class area, and an instance belongs to the heap area.
 * 
 * 2) Can we override java main method?
 * ==> No, because the main is a static method.
 * */
package com.java.kalpesh.polymorphism.overriding;

//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  
class Vehicle {
	// defining a method
	//If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive.
	protected void run() {
		System.out.println("Vehicle is running");
	}
}

// Creating a child class
class Bike2 extends Vehicle {
	// defining the same method as in the parent class
	 public void run() {
		System.out.println("Bike is running safely");
	}
}

class MethodOverriding {
	public static void main(String args[]) {
		Bike2 obj = new Bike2();// creating object
		obj.run();// calling method
	}
}