/*Instance Initializer block is used to initialize the instance data member. 
 * It run each time when object of the class is created.
 * The initialization of the instance variable can be done directly but there can be performed extra operations while initializing the instance variable in the instance initializer block.
 * 
 * Suppose I have to perform some operations while assigning value to instance data member e.g. a for loop to fill a complex array or error handling etc.
 * 
 * There are three places in java where you can perform operations:
 * 		method
 * 		constructor
 * 		block
 * 
 * What is invoked first, instance initializer block or constructor?
 * ==> It seems that instance initializer block is firstly invoked but NO. 
 * Instance intializer block is invoked at the time of object creation. 
 * The java compiler copies the instance initializer block in the constructor after the first statement super().
 * So firstly, constructor is invoked.
 * 
 * Note: The java compiler copies the code of instance initializer block in every constructor.
 * 
 * Rules for instance initializer block :
 * 	1. The instance initializer block is created when instance of the class is created.
 * 	2. The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
 * 	3. The instance initializer block comes in the order in which they appear.
*/
package com.java.kalpesh.Instanceinitializerblock;

class Demo {
	int speed;

	Demo() {
		System.out.println("speed is " + speed);
		System.out.println("constructor is invoked");
	}

	{
		speed = 100;
		System.out.println("instance initializer block invoked");
	}

	public static void main(String args[]) {
		Demo b1 = new Demo();
		Demo b2 = new Demo();
	}
}