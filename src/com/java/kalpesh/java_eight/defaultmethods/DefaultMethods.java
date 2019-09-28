package com.java.kalpesh.java_eight.defaultmethods;

interface Sayable {
	// Default method
	default void say() {
		System.out.println("Hello, this is default method");
	}

	// Abstract method
	void sayMore(String msg);
}

public class DefaultMethods implements Sayable {
	public void sayMore(String msg) { // implementing abstract method
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DefaultMethods dm = new DefaultMethods();
		dm.say(); // calling default method
		dm.sayMore("Work is worship"); // calling abstract method
	}
}
/*
 * Java provides a facility to create default methods inside the interface.
 * Methods which are defined inside the interface and tagged with default are
 * known as default methods. These methods are non-abstract methods.
 */