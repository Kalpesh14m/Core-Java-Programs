package com.java.kalpesh.starpattern;

import com.java.kalpesh.inputscanner.InputScanner;

public class Star6 {
	public static void main(String[] args) {
		System.out.println("Please enter limit of Row: ");
		int rows = InputScanner.intScanner();
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = rows; i > 0; i--) {
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
			for (int k = rows; k >= i; k--) {
				System.out.print(" ");
			}

		}
	}
}
