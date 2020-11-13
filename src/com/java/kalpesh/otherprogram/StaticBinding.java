/*When type of the object is determined at compiled time(by the compiler), it is known as static binding.
 * 
 * If there is any private, final or static method in a class, there is static binding.
 * */
package com.java.kalpesh.otherprogram;

class StaticBinding {
	private void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String args[]) {
		StaticBinding d1 = new StaticBinding();
		d1.eat();
	}
}