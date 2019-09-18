package com.java.kalpesh.Interfacekeyword;

interface Printable2 {
	void print();
}

interface Showable2 extends Printable2 {
	void show();
}

class InterfaceInheritance implements Showable2 {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		InterfaceInheritance obj = new InterfaceInheritance();
		obj.print();
		obj.show();
	}
}