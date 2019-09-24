package com.java.kalpesh.inputscanner;

import java.util.Scanner;

public class InputScanner {

	private static final Scanner SC = new Scanner(System.in);
	private static int number;

	public static int intScanner() {
		return number = SC.nextInt();
	}
}
