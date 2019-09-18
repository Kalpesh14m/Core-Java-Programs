package com.java.kalpesh.number;

public class EqualsOnNumber {
	public static void main(String args[]) {
		Integer x = 5;
		Integer y = 10;
		Integer z = 5;
		Short a = 5;

		System.out.println(x.equals(y));
		System.out.println(x.equals(z));
		System.out.println(x.equals(a));
	}
}

/*
 * The method determines whether the Number object that invokes the method is
 * equal to the object that is passed as an argument.
 * 
 * Parameters Here is the detail of parameters −
 * 
 * Any object.
 * 
 * Return Value The method returns True if the argument is not null and is an
 * object of the same type and with the same numeric value. There are some extra
 * requirements for Double and Float objects that are described in the Java API
 * documentation.
 */