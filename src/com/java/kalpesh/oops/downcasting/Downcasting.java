package com.java.kalpesh.oops.downcasting;

class Animal15 {
}

public class Downcasting extends Animal15 {

	public static void main(String[] args) {
		// Downcasting a1 = new Animal15();//Compilation error: Type Mismatch
		Downcasting a1 = (Downcasting) new Animal15();// Compiles successfully
														// but
														// ClassCastException is
														// thrown at runtime
	}
}
