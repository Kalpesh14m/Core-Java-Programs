package com.java.kalpesh.continuekeyword;

public class ContinueKeyword {
	public static void main(String args[]) {
		int[] numbers = { 10, 20, 30, 40, 50 };

		for (int x : numbers) {
			if (x == 30) {
				continue;
			}
			System.out.print(x);
			System.out.print("\n");
		}
	}
}
/*
 * The continue keyword can be used in any of the loop control structures. It
 * causes the loop to immediately jump to the next iteration of the loop.
 * 
 * In a for loop, the continue keyword causes control to immediately jump to the
 * update statement.
 * 
 * In a while loop or do/while loop, control immediately jumps to the Boolean
 * expression.
 */
