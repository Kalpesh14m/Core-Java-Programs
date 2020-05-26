package com.java.kalpesh.oops.downcasting;

class Animal14 {
}

class DowncastingWithInstanceOf extends Animal14 {
	static void method(Animal14 a) {
		if (a instanceof DowncastingWithInstanceOf) {
			DowncastingWithInstanceOf d = (DowncastingWithInstanceOf) a;// downcasting
			System.out.println("ok downcasting performed");
		}
	}

	public static void main(String[] args) {
		Animal14 a = new DowncastingWithInstanceOf();
		DowncastingWithInstanceOf.method(a);
	}

}