/* Yes, by method overloading. 
 * You can have any number of main methods in a class by method overloading. 
 * But JVM calls main() method which receives string array as arguments only.*/
package com.java.kalpesh.polymorphism.overloading;

class OverloadMainMethod {
	public static void main(String[] args) {
		System.out.println("main with String[]");
		main();
		main("Kalpesh");
	}

	public static void main(String args) {
		System.out.println("main with String");
	}

	public static void main() {
		System.out.println("main without args");
	}
}