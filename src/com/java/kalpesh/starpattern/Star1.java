package com.java.kalpesh.starpattern;

import com.java.kalpesh.kalpesh.inputscanner.InputScanner;

public class Star1 {

	public static void main(String[] args) {
		System.out.println("Please enter limit of Row: ");
		int rows = InputScanner.intScanner();

		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//*
//**
//***
//****
//*****