package com.java.kalpesh.starpattern;

import com.java.kalpesh.inputscanner.InputScanner;

public class Star3 {
	public static void main(String[] args) {
		System.out.println("Please enter limit of Row: ");
		int rows = InputScanner.intScanner();

		for (int i = 0; i <= rows; i++) {
			for (int j = rows; j >= i; j--) {
				System.out.print("*");
			}
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
//*****
//**** 
//***  
//**   
//*