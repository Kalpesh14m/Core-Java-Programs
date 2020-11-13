/*The final keyword in java is used to restrict the user. 
 * The java final keyword can be used in many context. Final can be:
 * 		variable
 * 		method
 * 		class
 * 
 * The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. 
 * It can be initialized in the constructor only. 
 * The blank final variable can be static also which will be initialized in the static block only. 
 * 
 * 1) Java final variable:
 * 	If you make any variable as final, you cannot change the value of final variable(It will be constant).
 * 
 * */

package com.java.kalpesh.finalkeyword;

class FinalVariableWithConstructor {
	final int speedlimit;// final variable

	public FinalVariableWithConstructor() {
		speedlimit = 400;
	}

	public static void main(String args[]) {
		FinalVariableWithConstructor obj = new FinalVariableWithConstructor();
	}
}// end of class