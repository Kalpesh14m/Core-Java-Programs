package com.java.kalpesh.variabletype;

/*
 * Local Variables
Local variables are declared in methods, constructors, or blocks.

Local variables are created when the method, constructor or block is entered and the variable will be destroyed once it exits the method, constructor, or block.

Access modifiers cannot be used for local variables.

Local variables are visible only within the declared method, constructor, or block.

Local variables are implemented at stack level internally.

There is no default value for local variables, so local variables should be declared and an initial value should be assigned before the first use.
 * */
public class LocalVariable {
	public void pupAge() {
		//without initializing local variable, so it would give an error at the time of compilation.
		int age = 0;
		age = age + 7;
		System.out.println("Puppy age is : " + age);
	}

	public static void main(String args[]) {
		LocalVariable test = new LocalVariable();
		test.pupAge();
	}
}
/*
 * 
 * A variable provides us with named storage that our programs can manipulate.
 * Each variable in Java has a specific type, which determines the size and
 * layout of the variable's memory; the range of values that can be stored
 * within that memory; and the set of operations that can be applied to the
 * variable.
 * 
 * You must declare all variables before they can be used. Following is the
 * basic form of a variable declaration −
 * 
 * data type variable [ = value][, variable [ = value] ...] ; Here data type is
 * one of Java's datatypes and variable is the name of the variable. To declare
 * more than one variable of the specified type, you can use a comma-separated
 * list.
 * 
 * Following are valid examples of variable declaration and initialization in
 * Java −
 * 
 * Example
 * 
 * int a, b, c; // Declares three ints, a, b, and c.
 * 
 * int a = 10, b = 10; // Example of initialization
 * 
 * byte B = 22; // initializes a byte type variable B.
 * 
 * double pi = 3.14159; // declares and assigns a value of PI.
 * 
 * char a = 'a'; // the char variable a i is initialized with value 'a'.
 * 
 * There are three kinds of variables in Java −
 * 
 * Local variables
 * 
 * Instance variables
 * 
 * Class/Static variables
 * 
 */
