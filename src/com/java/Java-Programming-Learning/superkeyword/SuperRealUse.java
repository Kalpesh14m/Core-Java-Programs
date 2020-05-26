/*
 * The super keyword in Java is a reference variable which is used to refer immediate parent class object.
 * Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.
 * 
 * Usage of Java super Keyword:-
 * 		1. super can be used to refer immediate parent class instance variable.
 * 		2. super can be used to invoke immediate parent class method.
 * 		3. super() can be used to invoke immediate parent class constructor.
 */


package com.java.kalpesh.superkeyword;

class Person {
	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Emp extends Person {
	float salary;

	Emp(int id, String name, float salary) {
		super(id, name);// reusing parent constructor
		this.salary = salary;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

class SuperRealUse {
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "ankit", 45000f);
		e1.display();
	}
}