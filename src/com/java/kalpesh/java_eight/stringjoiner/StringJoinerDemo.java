package com.java.kalpesh.java_eight.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {

		//
		// StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as
		// delimiter
		// adding prefix and suffix
		StringJoiner joinNames = new StringJoiner(",", "[", "]"); // passing comma(,) and square-brackets as delimiter
																	// Adding values to StringJoiner
		joinNames.add("Rahul");
		joinNames.add("Raju");
		joinNames.add("Peter");
		joinNames.add("Raheem");

//		System.out.println(joinNames);

		// Merge Two StringJoiner
		StringJoiner joinNames1 = new StringJoiner(",", "[", "]"); // passing comma(,) and square-brackets as delimiter
		// Adding values to StringJoiner
		joinNames1.add("Rahul");
		joinNames1.add("Raju");

		// Creating StringJoiner with :(colon) delimiter
		StringJoiner joinNames2 = new StringJoiner(":", "[", "]"); // passing colon(:) and square-brackets as delimiter
		// Adding values to StringJoiner
		joinNames2.add("Peter");
		joinNames2.add("Raheem");

		// Merging two StringJoiner
		StringJoiner merge = joinNames1.merge(joinNames2);
		System.out.println(merge);

		// Methos in StringJoiner
		StringJoiner joinNames3 = new StringJoiner(","); // passing comma(,) as delimiter

		// Prints nothing because it is empty
		System.out.println(joinNames3);

		// We can set default empty value.
		joinNames3.setEmptyValue("It is empty");
		System.out.println(joinNames3);

		// Adding values to StringJoiner
		joinNames3.add("Rahul");
		joinNames3.add("Raju");
		System.out.println(joinNames3);

		// Returns length of StringJoiner
		int length = joinNames3.length();
		System.out.println("Length: " + length);

		// Returns StringJoiner as String type
		String str = joinNames3.toString();
		System.out.println(str);

		// Now, we can apply String methods on it
		char ch = str.charAt(3);
		System.out.println("Character at index 3: " + ch);

		// Adding one more element
		joinNames3.add("Sorabh");
		System.out.println(joinNames3);

		// Returns length
		int newLength = joinNames3.length();
		System.out.println("New Length: " + newLength);
	}
}
