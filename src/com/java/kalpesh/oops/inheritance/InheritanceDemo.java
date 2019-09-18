/* Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. 
 * It is an important part of OOPs.
 * Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
 * 	Why use inheritance in java
		1. For Method Overriding (so runtime polymorphism can be achieved).
		2. For Code Reusability.
 * Terms used in Inheritance
		Class: A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.
		Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.
		Super Class/Parent Class: Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.
		Reusability: As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class. You can use the same fields and methods already defined in the previous class.
		
 */

package com.java.kalpesh.oops.inheritance;

class A {
	public void add(int a, int b) {
		System.out.println("In A : A + B : " + (a + b));
	}
}

class B extends A {
	public void add(int a, int b) {
		System.out.println("In B : A + B : " + (a + b));
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		A a1 = new A();
		a1.add(10, 20);

		B b1 = new B();
		b1.add(100, 200);

		A ab1 = new B();
		ab1.add(50, 50);

		// B ba1 = new A();//Type missmatch: can not convert from A to B
		// ba1.add(30, 30);

	}
}