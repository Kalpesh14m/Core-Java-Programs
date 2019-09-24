package com.java.demo.programs;

import java.util.Scanner;

public class DemoStar {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the lines");
		int n = scanner.nextInt();
		printStars(n);

	}

	private static void printStars(int n) {
		int stars = 1;
		for (int i = 1; i <= n; i++) {
			for (int space = i; space < n; space++) {
				System.out.print(" ");
			}
			for (int j = 0; j < stars; j++) {
				System.out.print("*");
			}
			stars = stars + 2;
			System.out.println();
		}
	}
}
