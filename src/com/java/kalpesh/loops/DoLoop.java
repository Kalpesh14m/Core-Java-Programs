package com.java.kalpesh.loops;

public class DoLoop {
	public static void main(String args[]) {
		int x = 10;

		do {
			System.out.print("value of x : " + x);
			x++;
			System.out.print("\n");
		} while (x < 20);
	}
}
/*
 * A do...while loop is similar to a while loop, except that a do...while loop
 * is guaranteed to execute at least one time.
 * 
 * Notice that the Boolean expression appears at the end of the loop, so the
 * statements in the loop execute once before the Boolean is tested.
 * 
 * If the Boolean expression is true, the control jumps back up to do statement,
 * and the statements in the loop execute again. This process repeats until the
 * Boolean expression is false.
 */
