package com.java.kalpesh.firstprog;

/*
 * Java Package ==>
 * In simple words, it is a way of categorizing the classes and interfaces. 
 * When developing applications in Java, hundreds of classes and interfaces will be written, therefore categorizing these classes is a must as well as makes life much easier.
 * */

/*
 * Import Statements ==>
 * In Java if a fully qualified name, which includes the package and the class name is given, then the compiler can easily locate the source code or classes. 
 * Import statement is a way of giving the proper location for the compiler to find that particular class.
 * 
 * For example, the following line would ask the compiler to load all the classes available in directory java_installation/java/io −
 * 
 * 		import java.io.*;
 * */

/**
 * The HelloWorld program implements an application that simply displays "Hello
 * World!" to the standard output.
 *
 * @author Kalpesh
 * @version 1.0
 * @since 2019-09-14
 */
public class HelloWorld/* Class Creation */ {
	public static void main(String[] args) {
		HelloWorld/* Class name */ hello/* Object name */ = new/* Memory Allocation */ HelloWorld()/*
																									 * Default
																									 * Constructor
																									 */;// Obj Creation
		System.out.println("Hellow World");// Printing msg
		hello.add();// Method calling using Obj
	}

	public void add() /* Method creation */ {
		// Method Body
		System.out.print("Add");
	}
}
/*
 * 
 * Source File Declaration Rules ==>
 * 
 * look into the source file declaration rules. These rules are essential when
 * declaring classes, import statements and package statements in a source file.
 * 
 * There can be only one public class per source file.
 * 
 * A source file can have multiple non-public classes.
 * 
 * The public class name should be the name of the source file as well which
 * should be appended by .java at the end. For example: the class name is public
 * class Employee{} then the source file should be as Employee.java.
 * 
 * If the class is defined inside a package, then the package statement should
 * be the first statement in the source file.
 * 
 * If import statements are present, then they must be written between the
 * package statement and the class declaration. If there are no package
 * statements, then the import statement should be the first line in the source
 * file.
 * 
 * Import and package statements will imply to all the classes present in the
 * source file. It is not possible to declare different import and/or package
 * statements to different classes in the source file.
 * 
 * Classes have several access levels and there are different types of classes;
 * abstract classes, final classes, etc. We will be explaining about all these
 * in the access modifiers chapter.
 * 
 * Apart from the above mentioned types of classes, Java also has some special
 * classes called Inner classes and Anonymous classes. Object ==> Objects have
 * states and behaviors. Example: A dog has states - color, name, breed as well
 * as behavior such as wagging their tail, barking, eating. An object is an
 * instance of a class.
 * 
 * State : It is represented by attributes of an object. It also reflects the
 * properties of an object.
 * 
 * Behavior : It is represented by methods of an object. It also reflects the
 * response of an object with other objects.
 * 
 * Identity : It gives a unique name to an object and enables one object to
 * interact with other objects.
 * 
 * There are three steps when creating an object from a class −
 * 
 * Declaration − A variable declaration with a variable name with an object
 * type.
 * 
 * Instantiation − The 'new' keyword is used to create the object.
 * 
 * Initialization − The 'new' keyword is followed by a call to a constructor.
 * This call initializes the new object.
 * 
 * Class ==> A class can be defined as a template/blueprint that describes the
 * behavior/state that the object of its type supports.
 * 
 * Methods ==> A method is basically a behavior. A class can contain many
 * methods. It is in methods where the logics are written, data is manipulated
 * and all the actions are executed.
 * 
 * Declaration − A variable declaration with a variable name with an object
 * type.
 * 
 * Instantiation − The 'new' keyword is used to create the object.
 * 
 * Initialization − The 'new' keyword is followed by a call to a constructor.
 * This call initializes the new object.
 * 
 * 
 * Instance Variables ==> Each object has its unique set of instance variables.
 * An object's state is created by the values assigned to these instance
 * variables.
 * 
 * Basic Syntax ==>
 * 
 * Case Sensitivity − Java is case sensitive, which means identifier Hello and
 * hello would have different meaning in Java.
 * 
 * Class Names − For all class names the first letter should be in Upper Case.
 * If several words are used to form a name of the class, each inner word's
 * first letter should be in Upper Case.
 * 
 * Example: class MyFirstJavaClass
 * 
 * Method Names − All method names should start with a Lower Case letter. If
 * several words are used to form the name of the method, then each inner word's
 * first letter should be in Upper Case.
 * 
 * Example: public void myMethodName()
 * 
 * Program File Name − Name of the program file should exactly match the class
 * name.
 * 
 * When saving the file, you should save it using the class name (Remember Java
 * is case sensitive) and append '.java' to the end of the name (if the file
 * name and the class name do not match, your program will not compile).
 * 
 * But please make a note that in case you do not have a public class present in
 * the file then file name can be different than class name. It is also not
 * mandatory to have a public class in the file.
 * 
 * Example: Assume 'MyFirstJavaProgram' is the class name. Then the file should
 * be saved as 'MyFirstJavaProgram.java'
 * 
 * public static void main(String args[]) − Java program processing starts from
 * the main() method which is a mandatory part of every Java program.
 * 
 * 
 * Java Modifiers ==> Like other languages, it is possible to modify classes,
 * methods, etc., by using modifiers. There are two categories of modifiers −
 * 
 * Access Modifiers − default, public , protected, private
 * 
 * Non-access Modifiers − final, abstract, strictfp
 * 
 * 
 * Java Variables ==> Following are the types of variables in Java −>
 * 
 * Local variables − Variables defined inside methods, constructors or blocks
 * are called local variables. The variable will be declared and initialized
 * within the method and the variable will be destroyed when the method has
 * completed.
 * 
 * Instance variables − Instance variables are variables within a class but
 * outside any method. These variables are initialized when the class is
 * instantiated. Instance variables can be accessed from inside any method,
 * constructor or blocks of that particular class.
 * 
 * Class variables − Class variables are variables declared within a class,
 * outside any method, with the static keyword.
 */
//OOP ==> Object Oriented Program
//1. Class ==> A class is a user defined blueprint or prototype from which objects are created.  
//2. Object ==>  the real life entities==>
//