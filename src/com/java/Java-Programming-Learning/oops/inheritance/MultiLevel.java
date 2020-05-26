package com.java.kalpesh.oops.inheritance;

class Animal1 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("barking...");
	}
}

class BabyDog1 extends Dog {
	void weep() {
		System.out.println("weeping...");
	}
}

public class MultiLevel {
	public static void main(String args[]) {
		BabyDog1 d = new BabyDog1();
		d.weep();
		d.bark();
		d.eat();
	}
}