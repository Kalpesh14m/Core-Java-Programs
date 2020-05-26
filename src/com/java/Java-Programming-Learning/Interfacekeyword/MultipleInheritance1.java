package com.java.kalpesh.Interfacekeyword;

interface Printable1 {
	void print();
}

interface Showable1 {
	void print();
}

public class MultipleInheritance1 implements Printable1, Showable1 {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		MultipleInheritance1 obj = new MultipleInheritance1();
		obj.print();
	}
}