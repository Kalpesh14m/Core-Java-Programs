/*The this() constructor call can be used to invoke the current class constructor. 
 * It is used to reuse the constructor. 
 * In other words, it is used for constructor chaining.
*/
package com.java.kalpesh.thiskeyword;

class A1 {

	A1() {
		this("Kalpesh");
		System.out.println("hello a");
	}

	A1(int x) {
		this();
		System.out.println(x);
	}

	A1(String name) {
		System.out.println(name);
	}

}

class InvokeCurrentClassConstructor {
	public static void main(String args[]) {
		A1 a = new A1(10);
	}
}