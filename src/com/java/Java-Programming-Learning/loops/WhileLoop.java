package com.java.kalpesh.loops;

public class WhileLoop {
	public static void main(String args[]) {
		int x = 10;

		while (x < 20) {
			System.out.print("value of x : " + x);
			x++;
			System.out.print("\n");
		}
	}
}
/*
 * Here, statement(s) may be a single statement or a block of statements. The
 * condition may be any expression, and true is any non zero value.
 * 
 * When executing, if the boolean_expression result is true, then the actions
 * inside the loop will be executed. This will continue as long as the
 * expression result is true.
 * 
 * When the condition becomes false, program control passes to the line
 * immediately following the loop.
 * 
 * Here, key point of the while loop is that the loop might not ever run. When
 * the expression is tested and the result is false, the loop body will be
 * skipped and the first statement after the while loop will be executed.
 */
