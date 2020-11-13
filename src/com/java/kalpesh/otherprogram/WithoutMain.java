/*
 * Can we execute a program without main() method?
 * 	Ans) No, one of the ways was the static block, but it was possible till JDK 1.6. Since JDK 1.7, it is not possible to execute a java class without the main method.
*/

package com.java.kalpesh.otherprogram;

class WithoutMain {
	static {
		System.out.println("static block is invoked");
		System.exit(0);
	}
}