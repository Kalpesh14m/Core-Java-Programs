package com.java.kalpesh.operators;

//public class instanceofOperator {
//	public static void main(String args[]) {
//
//		String name = "Kalpesh";
//
//		// following will return true since name is type of String
//		boolean result = name instanceof String;
//		System.out.println(result);
//	}
//}

class Vehicle {
}

public class instanceofOperator extends Vehicle {

	public static void main(String args[]) {

		Vehicle a = new instanceofOperator();
		boolean result = a instanceof instanceofOperator;
		System.out.println(result);
	}
}
/*
 * This operator is used only for object reference variables. The operator
 * checks whether the object is of a particular type (class type or interface
 * type). instanceof operator is written as −
 * 
 * ( Object reference variable ) instanceof (class/interface type) If the object
 * referred by the variable on the left side of the operator passes the IS-A
 * check for the class/interface type on the right side, then the result will be
 * true.
 */
