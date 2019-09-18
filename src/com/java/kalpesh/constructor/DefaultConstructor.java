package com.java.kalpesh.constructor;

/* 
 * In Java, a constructor is a block of codes similar to the method. 
 * It is called when an instance of the class is created. 
 * At the time of calling constructor, memory for the object is allocated in the memory.
 * It is a special type of method which is used to initialize the object.
 * Every time an object is created using the new() keyword, at least one constructor is called.
 * The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type
 * It calls a default constructor if there is no constructor available in the class. 
 * In such case, Java compiler provides a default constructor by default.
 * Note: We can use access modifiers while declaring a constructor. It controls the object creation. In other words, we can have private, protected, public or default constructor in Java.
 */

/*No argument Constructors ==> 
 * As the name specifies the no argument constructors of Java does not accept any parameters instead, using these constructors the instance variables of a method will be initialized with fixed values for all objects.package com.java.kalpesh.constructor;
*/
//Java Program to create and call a default constructor  
class DefaultConstructor {
	// creating a default constructor
	DefaultConstructor() {
		System.out.println("DefaultConstructor");
	}

	// main method
	public static void main(String args[]) {
		// calling a default constructor
		DefaultConstructor b = new DefaultConstructor();
	}
}
/*
 * A constructor initializes an object when it is created. It has the same name
 * as its class and is syntactically similar to a method. However, constructors
 * have no explicit return type.
 * 
 * Typically, you will use a constructor to give initial values to the instance
 * variables defined by the class, or to perform any other start-up procedures
 * required to create a fully formed object.
 * 
 * All classes have constructors, whether you define one or not, because Java
 * automatically provides a default constructor that initializes all member
 * variables to zero. However, once you define your own constructor, the default
 * constructor is no longer used.
 * 
 * class ClassName { ClassName() { } }
 * 
 * Java allows two types of constructors namely −
 * 
 * No argument Constructors
 * 
 * Parameterized Constructors
 */
