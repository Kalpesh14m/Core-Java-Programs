/*A final variable that is not initialized at the time of declaration is known as blank final variable.
 * 
 * If you want to create a variable that is initialized at the time of creating object and once initialized may not be changed, it is useful. 
 * For example PAN CARD number of an employee.
 * 
 * It can be initialized only in constructor.
 * */

package com.java.kalpesh.finalkeyword;

class BlankOrUninitializedFinalVariable {
	final int speedlimit;// blank final variable

	BlankOrUninitializedFinalVariable() {
		speedlimit = 70;
		System.out.println(speedlimit);
	}

	public static void main(String args[]) {
		new BlankOrUninitializedFinalVariable();
	}
}