/*It is useful if we have to use one object in multiple classes.*/
package com.java.kalpesh.thiskeyword;

class B {
	PassAsArgumentInTheConstructorCall obj;

	B(PassAsArgumentInTheConstructorCall obj) {
		this.obj = obj;
	}

	void display() {
		System.out.println(obj.data);// using data member of A4 class
	}
}

class PassAsArgumentInTheConstructorCall {
	int data = 10;

	PassAsArgumentInTheConstructorCall() {
		B b = new B(this);
		b.display();
	}

	public static void main(String args[]) {
		PassAsArgumentInTheConstructorCall a = new PassAsArgumentInTheConstructorCall();
	}
}