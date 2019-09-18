package com.java.kalpesh.superkeyword;

class Animal1 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1 {
	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();
		bark();
	}
}

public class SuperWithMethod {

	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.work();
	}

}
