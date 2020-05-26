/*Rule: If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract.*/

package com.java.kalpesh.abstractkeyword;

//Example of an abstract class that has abstract and non-abstract methods  
abstract class Bike1 {
	Bike1() {
		System.out.println("bike is created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear changed");
	}
}

// Creating a Child class which inherits Abstract class
class Honda extends Bike1 {
	void run() {
		System.out.println("running safely..");
	}
}

// Creating a Test class which calls abstract and non-abstract methods
class AbstractClass_Constructor_DataMember_Methods {
	public static void main(String args[]) {
		Bike1 obj = new Honda();
		obj.run();
		obj.changeGear();
	}
}