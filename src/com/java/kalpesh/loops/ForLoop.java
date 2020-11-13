package com.java.kalpesh.loops;

public class ForLoop {

	public static void main(String args[]) {

		for (int x = 10; x < 20; x = x + 1) {
			System.out.print("value of x : " + x);
			System.out.print("\n");
		}
	}
}
/*
 * Here is the flow of control in a for loop −
 * 
 * The initialization step is executed first, and only once. This step allows
 * you to declare and initialize any loop control variables and this step ends
 * with a semi colon (;).
 * 
 * Next, the Boolean expression is evaluated. If it is true, the body of the
 * loop is executed. If it is false, the body of the loop will not be executed
 * and control jumps to the next statement past the for loop.
 * 
 * After the body of the for loop gets executed, the control jumps back up to
 * the update statement. This statement allows you to update any loop control
 * variables. This statement can be left blank with a semicolon at the end.
 * 
 * The Boolean expression is now evaluated again. If it is true, the loop
 * executes and the process repeats (body of loop, then update step, then
 * Boolean expression). After the Boolean expression is false, the for loop
 * terminates.
 */
