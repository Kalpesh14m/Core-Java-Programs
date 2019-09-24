package com.java.kalpesh.java_eight.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
	static void printMessage(String name) {
		System.out.println("Hello " + name);
	}

	static void printValue(int val) {
		System.out.println(val);
	}

	static void addList(List<Integer> list) {
		// Return sum of list values
		int result = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of list values: " + result);
	}

	public static void main(String[] args) {
		// Referring method to String type Consumer interface
		Consumer<String> consumer1 = ConsumerInterface::printMessage;
		consumer1.accept("John"); // Calling Consumer method
		// Referring method to Integer type Consumer interface
		Consumer<Integer> consumer2 = ConsumerInterface::printValue;
		consumer2.accept(12); // Calling Consumer method

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
// Referring method to String type Consumer interface   
		Consumer<List<Integer>> consumer = ConsumerInterface::addList;
		consumer.accept(list); // Calling Consumer method
	}
}
/*
 * It is a functional interface defined in java.util.function package. It
 * contains an abstract accept() and a default andThen() method. It can be used
 * as the assignment target for a lambda expression or method reference.
 * 
 * The Consumer Interface accepts a single argument and does not return any
 * result.
 * 
 * Java Consumer Interface Methods Method Description void accept(T t) It
 * performs this operation on the given argument. default Consumer<T>
 * andThen(Consumer<? super T> after) It returns a composed Consumer that
 * performs, in sequence, this operation followed by the after operation. If
 * performing either operation throws an exception, it is relayed to the caller
 * of the composed operation. If performing this operation throws an exception,
 * the after operation will not be performed.
 */