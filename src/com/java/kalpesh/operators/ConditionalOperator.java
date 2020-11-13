package com.java.kalpesh.operators;

public class ConditionalOperator {
	public static void main(String args[]) {
		int a, b;
		a = 10;
		b = (a == 1) ? 20 : 30;
		System.out.println("Value of b is : " + b);

		b = (a == 10) ? 20 : 30;
		System.out.println("Value of b is : " + b);

		b = (20 > 30) ? 20 : 30;
		System.out.println("Value of b is : " + b);

	}
}

/*
 * Conditional operator is also known as the ternary operator. This operator
 * consists of three operands and is used to evaluate Boolean expressions. The
 * goal of the operator is to decide, which value should be assigned to the
 * variable.
 */