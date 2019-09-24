package com.java.kalpesh.java_eight.methodreferance;

import java.util.function.BiFunction;

//referring non-static methods. You can refer methods by class object and anonymous object.

class Arithmetic1 {
	public int add(int a, int b) {
		return a + b;
	}
}

interface Sayable1 {
	void say();
}

public class ReferenceToAnInstanceMethod {
	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

	public void printnMsg() {
		System.out.println("Hello, this is instance method");
	}

	public static void main(String[] args) {
		ReferenceToAnInstanceMethod methodReference = new ReferenceToAnInstanceMethod(); // Creating object
		// Referring non-static method using reference
		Sayable1 sayable = methodReference::saySomething;
		// Calling interface method
		sayable.say();
		// Referring non-static method using anonymous object
		Sayable1 sayable2 = new ReferenceToAnInstanceMethod()::saySomething; // You can use anonymous object also
		// Calling interface method
		sayable2.say();

		Thread t2 = new Thread(new ReferenceToAnInstanceMethod()::printnMsg);
		t2.start();

		BiFunction<Integer, Integer, Integer> adder = new Arithmetic1()::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}
}
