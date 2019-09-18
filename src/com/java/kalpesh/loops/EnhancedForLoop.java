package com.java.kalpesh.loops;

public class EnhancedForLoop {
	public static void main(String args[]) {
		int[] numbers = { 10, 20, 30, 40, 50 };

		for (int x : numbers) {
			System.out.print(x);
			System.out.print(",");
		}
		System.out.print("\n");
		String[] names = { "Kalpesh", "Jayesh", "Akshy", "Ganesh" };

		for (String name : names) {
			System.out.print(name);
			System.out.print(",");
		}
	}
}

/*
 * s of Java 5, the enhanced for loop was introduced. This is mainly used to
 * traverse collection of elements including arrays.
 * 
 * Declaration − The newly declared block variable, is of a type compatible with
 * the elements of the array you are accessing. The variable will be available
 * within the for block and its value would be the same as the current array
 * element.
 * 
 * Expression − This evaluates to the array you need to loop through. The
 * expression can be an array variable or method call that returns an array.
 */
