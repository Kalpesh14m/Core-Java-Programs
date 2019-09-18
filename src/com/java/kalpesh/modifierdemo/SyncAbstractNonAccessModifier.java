package com.java.kalpesh.modifierdemo;

public class SyncAbstractNonAccessModifier {
	// Transient Modifier
	public transient int limit = 55; // will not persist
	public int b; // will persist

	// Synchronized Modifier
	public synchronized void showDetails() {
	}
}

class MyRunnable implements Runnable {
	private volatile boolean active;

	public void run() {
		active = true;
		while (active) { // line 1
			// some code here
		}
	}

	public void stop() {
		active = false; // line 2
	}
}
/*
 * The Synchronized Modifier ==>
 * 
 * The synchronized keyword used to indicate that a method can be accessed by
 * only one thread at a time. The synchronized modifier can be applied with any
 * of the four access level modifiers.
 * 
 * The Transient Modifier ==>
 * 
 * An instance variable is marked transient to indicate the JVM to skip the
 * particular variable when serializing the object containing it.
 * 
 * This modifier is included in the statement that creates the variable,
 * preceding the class or data type of the variable.
 * 
 * The Volatile Modifier ==>
 * 
 * The volatile modifier is used to let the JVM know that a thread accessing the
 * variable must always merge its own private copy of the variable with the
 * master copy in the memory.
 * 
 * Accessing a volatile variable synchronizes all the cached copied of the
 * variables in the main memory. Volatile can only be applied to instance
 * variables, which are of type object or private. A volatile object reference
 * can be null.
 * 
 * Usually, run() is called in one thread (the one you start using the
 * Runnable), and stop() is called from another thread. If in line 1, the cached
 * value of active is used, the loop may not stop when you set active to false
 * in line 2. That's when you want to use volatile.
 */
