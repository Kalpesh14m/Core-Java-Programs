/*Restrictions for the static method:
 * 		The static method can not use non static data member or call non-static method directly.
 * 		this and super cannot be used in static context.
 * 
 * 
 * Why is the Java main method static?
 * 	Ans) It is because the object is not required to call a static method. 
 * 	If it were a non-static method, JVM creates an object first then call main() method that will lead the problem of extra memory allocation.
 * */

package com.java.kalpesh.staticdemo;

//Java Program to get the cube of a given number using the static method  

class StaticMethod {
	static int cube(int x) {
		return x * x * x;
	}

	public static void main(String args[]) {
		int result = StaticMethod.cube(5);
		System.out.println(result);
	}
}