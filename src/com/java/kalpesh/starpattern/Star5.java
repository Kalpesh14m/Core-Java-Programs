package com.java.kalpesh.starpattern;

import com.java.kalpesh.inputscanner.InputScanner;

public class Star5 {
	public static void main(String[] args) {
		System.out.println("Please enter limit of Row: ");
		int rows = InputScanner.intScanner();
	
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
//**********
// *******
//  *****
//  ***
//   *