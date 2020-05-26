package com.java.kalpesh.java_eight.methodreferance;

import java.util.function.BiFunction;

interface Sayable {
	void say();
}

class Arithmetic {
	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}
}

public class ReferenceToAStaticMethod {
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		// Referring static method
		Sayable sayable = ReferenceToAStaticMethod::saySomething;
		// Calling interface method
		sayable.say();

		Thread t = new Thread(ReferenceToAStaticMethod::ThreadStatus);
		t.start();

		BiFunction<Integer, Integer, Integer> adder1 = Arithmetic::add;
		int result1 = adder1.apply(10, 20);
		System.out.println(result1);

		BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
		float result2 = adder2.apply(10, 20.0f);
		System.out.println(result2);

		BiFunction<Float, Float, Float> adder3 = Arithmetic::add;
		float result3 = adder3.apply(10.0f, 20.0f);
		System.out.println(result3);

	}
}
