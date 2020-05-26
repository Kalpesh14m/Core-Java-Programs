package com.java.kalpesh.java_eight.methodreferance;

interface Messageable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.print(msg);
	}
}

public class ReferenceToAConstructor {
	public static void main(String[] args) {
		Messageable hello = Message::new;
		hello.getMessage("Hello");
	}
}
