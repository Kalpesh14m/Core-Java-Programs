package com.java.kalpesh.thiskeyword;

class ProvingThisKeyword {
	void m() {
		System.out.println(this);// prints same reference ID
	}

	public static void main(String args[]) {
		ProvingThisKeyword obj = new ProvingThisKeyword();
		System.out.println(obj);// prints the reference ID
		obj.m();
	}
}