package com.java.kalpesh.constructor;

//Java program to overload constructors  
class ConstructorOverloading {
	int id;
	String name;
	int age;

	// creating two arg constructor
	ConstructorOverloading(int i, String n) {
		id = i;
		name = n;
	}

	// creating three arg constructor
	ConstructorOverloading(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		ConstructorOverloading s1 = new ConstructorOverloading(111, "Karan");
		ConstructorOverloading s2 = new ConstructorOverloading(222, "Aryan", 25);
		s1.display();
		s2.display();
	}
}