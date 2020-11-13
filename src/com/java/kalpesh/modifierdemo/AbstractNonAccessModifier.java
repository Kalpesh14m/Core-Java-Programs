package com.java.kalpesh.modifierdemo;

abstract class AbstractNonAccessModifier {
	public static void main(String[] args) {
		AbsClass abs = new SubClass();
		abs.changeColor();
		abs.goFast();
	}
}

abstract class AbsClass {
	private double price;
	private String model;
	private String year;

	public abstract void goFast(); // an abstract method

	public void changeColor() {
		System.out.println("Method body in abstract class means Non-Abs-Method");
	}
}

class SubClass extends AbsClass {
	// implements the abstract method
	@Override
	public void goFast() {
		System.out.println("Method body for abstract Method");
	}

	@Override
	public void changeColor() {
		System.out.println("Overried Non-Abs Method in Subclass");
	}
}
/*
 * Abstract Class ==> An abstract class can never be instantiated. If a class is
 * declared as abstract then the sole purpose is for the class to be extended.
 * 
 * A class cannot be both abstract and final (since a final class cannot be
 * extended). If a class contains abstract methods then the class should be
 * declared abstract. Otherwise, a compile error will be thrown.
 * 
 * An abstract class may contain both abstract methods as well normal methods.
 * 
 * 
 * Abstract Methods ==> An abstract method is a method declared without any
 * implementation. The methods body (implementation) is provided by the
 * subclass. Abstract methods can never be final or strict.
 * 
 * Any class that extends an abstract class must implement all the abstract
 * methods of the super class, unless the subclass is also an abstract class.
 * 
 * If a class contains one or more abstract methods, then the class must be
 * declared abstract. An abstract class does not need to contain abstract
 * methods.
 * 
 * The abstract method ends with a semicolon. Example: public abstract sample();
 **/
