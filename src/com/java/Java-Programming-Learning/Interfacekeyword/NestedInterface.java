/*
Note: An interface can have another interface which is known as a nested interface.
*/
package com.java.kalpesh.Interfacekeyword;

interface NestedInterface {
	void print();

	interface MessagePrintable {
		void msg();
	}
}