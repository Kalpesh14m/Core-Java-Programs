package com.java.kalpesh.java_eight.defaultmethods;

abstract class AbstractClass {
	public AbstractClass() { // constructor
		System.out.println("You can create constructor in abstract class");
	}

	abstract int add(int a, int b); // abstract method

	int sub(int a, int b) { // non-abstract method
		return a - b;
	}

	static int multiply(int a, int b) { // static method
		return a * b;
	}
}

public class Abstract_Class_vs_Java_8_Interface extends AbstractClass {
	public int add(int a, int b) { // implementing abstract method
		return a + b;
	}

	public static void main(String[] args) {
		Abstract_Class_vs_Java_8_Interface a = new Abstract_Class_vs_Java_8_Interface();
		int result1 = a.add(20, 10); // calling abstract method
		int result2 = a.sub(20, 10); // calling non-abstract method
		int result3 = AbstractClass.multiply(20, 10); // calling static method
		System.out.println("Addition: " + result1);
		System.out.println("Substraction: " + result2);
		System.out.println("Multiplication: " + result3);
	}
}