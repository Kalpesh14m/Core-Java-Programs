package com.java.kalpesh.operators;

public class BitwiseOperators {
	public static void main(String[] args) {
		int a = 60;// 00111100
		int b = 13;// 00001101

		System.out.println("a&b  : " + (a & b));// 0000 1100 // 12
		System.out.println("a|b  : " + (a | b));// 0011 1101 // 61
		System.out.println("a^b  : " + (a ^ b));// 0011 0001 // 49
		System.out.println("~a  : " + (~a));// 1100 0011 // -61
		System.out.println("a<<2  : " + (a << 2));// 1111 0000 // 240
		System.out.println("a>>2  : " + (a >> 2));// 1111 // 15
		System.out.println("Zero fill right shift a>>2  : " + (a >> 2));// 0000 1111 // 15

	}
}
