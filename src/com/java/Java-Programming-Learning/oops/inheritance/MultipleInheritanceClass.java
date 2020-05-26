/*Consider a scenario where A, B, and C are three classes. 
 * The C class inherits A and B classes. 
 * If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.
 * Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. 
 * So whether you have same method or different, there will be compile time error.
 */

package com.java.kalpesh.oops.inheritance;

class A11 {
	void msg() {
		System.out.println("Hello");
	}
}

class B11 {
	void msg() {
		System.out.println("Welcome");
	}
}

class MultipleInheritanceClass extends A11,B11
{

	public static void main(String args[]) {
		MultipleInheritanceClass obj = new MultipleInheritanceClass();
		obj.msg();// Now which msg() method would be invoked?
	}
}