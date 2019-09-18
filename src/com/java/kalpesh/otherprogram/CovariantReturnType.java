package com.java.kalpesh.otherprogram;


/*The covariant return type specifies that the return type may vary in the same direction as the subclass.
 * Before Java5, it was not possible to override any method by changing the return type. 
 * But now, since Java5, it is possible to override method by changing the return type if subclass overrides any method whose return type is Non-Primitive but it changes its return type to subclass type.
 * 
 * 
 *  The return type of the get() method of A class is A but the return type of the get() method of B class is B. 
 *  Both methods have different return type but it is method overriding. This is known as covariant return type.
 *  
 *  
 *  How is Covariant return types implemented
 *  Java doesn't allow the return type based overloading but JVM always allows return type based overloading. 
 *  JVM uses full signature of a method for lookup/resolution. 
 *  Full signature means it includes return type in addition to argument types. 
 *  i.e., a class can have two or more methods differing only by return type. 
 *  javac uses this fact to implement covariant return types.
*/


class A {
	A get() {		
		return this;
	}
}

public class CovariantReturnType extends A {
	CovariantReturnType get() {
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}

	public static void main(String args[]) {
		new CovariantReturnType().get().message();
	}
}