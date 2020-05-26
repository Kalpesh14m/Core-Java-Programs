/* If there are no matching type arguments in the method, and each method promotes similar number of arguments, there will be ambiguity.
 * One type is not de-promoted implicitly for example double cannot be depromoted to any type implicitly.
 * */

package com.java.kalpesh.polymorphism.overloading;

class TypePromotionAmbiguity {
	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");
	}

	public static void main(String args[]) {
		TypePromotionAmbiguity obj = new TypePromotionAmbiguity();
		obj.sum(20, 20);// now ambiguity
	}
}