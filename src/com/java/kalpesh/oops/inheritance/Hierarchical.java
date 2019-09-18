package com.java.kalpesh.oops.inheritance;

class Animal3 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog3 extends Animal3 {
	void bark() {
		System.out.println("barking...");
	}
}

class Cat3 extends Animal3 {
	void meow() {
		System.out.println("meowing...");
	}
}

public class Hierarchical {
	public static void main(String args[]) {
		Cat3 c = new Cat3();
		c.meow();
		c.eat();
		// c.bark();//C.T.Error
	}
}
