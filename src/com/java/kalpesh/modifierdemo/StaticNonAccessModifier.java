package com.java.kalpesh.modifierdemo;

public class StaticNonAccessModifier {
	private static int numInstances = 0;

	protected static int getCount() {
		return numInstances;
	}

	private static void addInstance() {
		numInstances++;
	}

	StaticNonAccessModifier() {
		StaticNonAccessModifier.addInstance();
	}

	public static void main(String[] arguments) {
		System.out.println("Starting with " + StaticNonAccessModifier.getCount() + " instances");

		for (int i = 0; i < 500; ++i) {
			new StaticNonAccessModifier();
		}
		System.out.println("Created " + StaticNonAccessModifier.getCount() + " instances");
	}
}
/*
 * Non-Access ==> Java provides a number of non-access modifiers to achieve many
 * other functionalities.
 * 
 * The static modifier for creating class methods and variables.
 * 
 * The final modifier for finalizing the implementations of classes, methods,
 * and variables.
 * 
 * The abstract modifier for creating abstract classes and methods.
 * 
 * The synchronized and volatile modifiers, which are used for threads.
 * 
 * 
 * he Static Modifier Static Variables The static keyword is used to create
 * variables that will exist independently of any instances created for the
 * class. Only one copy of the static variable exists regardless of the number
 * of instances of the class.
 * 
 * Static variables are also known as class variables. Local variables cannot be
 * declared static.
 * 
 * Static Methods The static keyword is used to create methods that will exist
 * independently of any instances created for the class.
 * 
 * Static methods do not use any instance variables of any object of the class
 * they are defined in. Static methods take all the data from parameters and
 * compute something from those parameters, with no reference to variables.
 * 
 * Class variables and methods can be accessed using the class name followed by
 * a dot and the name of the variable or method.
 */
