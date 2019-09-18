package com.java.kalpesh.oops.inheritance;

class Animal{  
	void eat(){System.out.println("eating...");}  
}  

class Dog extends Animal{  
	void bark(){System.out.println("barking...");}  
}  

public class SingleLevel {

	public static void main(String[] args) {
		Dog d=new Dog();  
		d.bark();  
		d.eat();  
	}
}