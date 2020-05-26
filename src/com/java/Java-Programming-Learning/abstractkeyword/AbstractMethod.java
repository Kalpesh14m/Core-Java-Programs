/*A class which is declared as abstract is known as an abstract class. 
 * It can have abstract and non-abstract methods. 
 * It needs to be extended and its method implemented. 
 * It cannot be instantiated.
 * An abstract class must be declared with an abstract keyword.
 * It can have constructors and static methods also.
 * It can have final methods which will force the subclass not to change the body of the method.
 * */

package com.java.kalpesh.abstractkeyword;

abstract class Bike {
	abstract void run();//no method body and abstract  
}

class AbstractMethod extends Bike {
	void run() {
		System.out.println("running safely");
	}

	public static void main(String args[]) {
		Bike obj = new AbstractMethod();
		obj.run();
	}
}