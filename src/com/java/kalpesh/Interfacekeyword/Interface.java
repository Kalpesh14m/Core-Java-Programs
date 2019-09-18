/*An interface in java is a blueprint of a class. 
 * It has static constants and abstract methods.
 * 
 * The interface in Java is a mechanism to achieve abstraction. 
 * There can be only abstract methods in the Java interface, not method body. 
 * It is used to achieve abstraction and multiple inheritance in Java.
 * 
 * In other words, you can say that interfaces can have abstract methods and variables. 
 * It cannot have a method body.
 * 
 * Java Interface also represents the IS-A relationship
 * It can be used to achieve loose coupling.
 * 
 * Since Java 8, we can have default and static methods in an interface.
 * Since Java 9, we can have private methods in an interface.
 * 
 * 
 * The Java compiler adds public and abstract keywords before the interface method. 
 * Moreover, it adds public, static and final keywords before data members.
 * 
 * interface abc{
 * int Min = 5;
 * void print();
 * }
 * 
 * interface abc{
 * public static int Min = 5;
 * public abstract void print();
 * }
 * 
 * 
 *  a class extends another class, an interface extends another interface, but a class implements an interface.
*/
package com.java.kalpesh.Interfacekeyword;

interface printable {
	void print();
}

class Interface implements printable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		Interface obj = new Interface();
		obj.print();
	}
}