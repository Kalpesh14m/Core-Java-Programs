/*In event handling (or) in a situation where we have to provide reference of a class to another one.
 * It is used to reuse one object in many methods.
 * */

package com.java.kalpesh.thiskeyword;

class PassAsAnArgumentInTheMethod {
	void m(PassAsAnArgumentInTheMethod obj) {
		System.out.println("method is invoked");
	}

	void p() {
		m(this);
	}

	public static void main(String args[]) {
		PassAsAnArgumentInTheMethod s1 = new PassAsAnArgumentInTheMethod();
		s1.p();
	}
}