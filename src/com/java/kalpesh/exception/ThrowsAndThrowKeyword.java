package com.java.kalpesh.exception;

public class ThrowsAndThrowKeyword {

	public static void main(String[] args) throws InvalidAgeException/* , Exception */ {
		int age = 10;
		try {
			validate(10);
//			testException();
		} /*
			 * catch (Throwable t) { t.printStackTrace(); }
			 */
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("Age Not valid");
		else
			System.out.println("welcome to vote");
	}
	/*
	 * public static void testException() throws Exception {
	 * ArrayIndexOutOfBoundsException ab = new ArrayIndexOutOfBoundsException();
	 * Exception ioe = new Exception(); ioe.initCause(ab); throw ioe; }
	 */}

class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
	}
}

/*
 * If a method does not handle a checked exception, the method must declare it
 * using the throws keyword. The throws keyword appears at the end of a method's
 * signature.
 * 
 * You can throw an exception, either a newly instantiated one or an exception
 * that you just caught, by using the throw keyword.
 * 
 * Try to understand the difference between throws and throw keywords, throws is
 * used to postpone the handling of a checked exception and throw is used to
 * invoke an exception explicitly.
 * 
 * You can create your own exceptions in Java. Keep the following points in mind
 * when writing your own exception classes −
 * 
 * All exceptions must be a child of Throwable.
 * 
 * If you want to write a checked exception that is automatically enforced by
 * the Handle or Declare Rule, you need to extend the Exception class.
 * 
 * If you want to write a runtime exception, you need to extend the
 * RuntimeException class.
 * 
 * Common Exceptions In Java, it is possible to define two catergories of
 * Exceptions and Errors.
 * 
 * JVM Exceptions − These are exceptions/errors that are exclusively or
 * logically thrown by the JVM. Examples: NullPointerException,
 * ArrayIndexOutOfBoundsException, ClassCastException.
 * 
 * Programmatic Exceptions − These exceptions are thrown explicitly by the
 * application or the API programmers. Examples: IllegalArgumentException,
 * IllegalStateException.
 */