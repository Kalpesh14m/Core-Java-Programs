package com.java.kalpesh.decisionmaking;

public class SwitchCase {
	public static void main(String args[]) {
		// char grade = args[0].charAt(0);
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
		case 'C':
			System.out.println("Well done");
			break;
		case 'D':
			System.out.println("You passed");
		case 'F':
			System.out.println("Better try again");
			break;
		default:
			System.out.println("Invalid grade");
		}
		System.out.println("Your grade is " + grade);
	}
}

/*
 * A switch statement allows a variable to be tested for equality against a list
 * of values. Each value is called a case, and the variable being switched on is
 * checked for each case.
 * 
 * The following rules apply to a switch statement −
 * 
 * The variable used in a switch statement can only be integers, convertable
 * integers (byte, short, char), strings and enums.
 * 
 * You can have any number of case statements within a switch. Each case is
 * followed by the value to be compared to and a colon.
 * 
 * The value for a case must be the same data type as the variable in the switch
 * and it must be a constant or a literal.
 * 
 * When the variable being switched on is equal to a case, the statements
 * following that case will execute until a break statement is reached.
 * 
 * When a break statement is reached, the switch terminates, and the flow of
 * control jumps to the next line following the switch statement.
 * 
 * Not every case needs to contain a break. If no break appears, the flow of
 * control will fall through to subsequent cases until a break is reached.
 * 
 * A switch statement can have an optional default case, which must appear at
 * the end of the switch. The default case can be used for performing a task
 * when none of the cases is true. No break is needed in the default case.
 * 
 */
