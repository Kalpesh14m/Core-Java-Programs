package com.java.kalpesh.staticdemo;

//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  
public class StaticVariable {
	int a=0;//instance variable //will get memory each time when the instance is created  
	static int c = 0;//static variable //will get memory only once and retain its value
	StaticVariable() {
		a++;
		c++;
		System.out.println(a + "\t\t   " + c );
	}

	public static void main(String args[]) {
		System.out.println("Non-Static \t Static");

		StaticVariable s1 = new StaticVariable();
		StaticVariable s2 = new StaticVariable();
		StaticVariable s3 = new StaticVariable();
	}
}