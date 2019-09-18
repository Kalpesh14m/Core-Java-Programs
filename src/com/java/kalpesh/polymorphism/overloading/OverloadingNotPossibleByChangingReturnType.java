/* method overloading is not possible by changing the return type of the method only because of ambiguity.*/

package com.java.kalpesh.polymorphism.overloading;

class Adder2 {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(int a, int b) {
		return a + b;
	}
}

class OverloadingNotPossibleByChangingReturnType {
	public static void main(String[] args) {
		System.out.println(Adder2.add(11, 11));// ambiguity
	}
}