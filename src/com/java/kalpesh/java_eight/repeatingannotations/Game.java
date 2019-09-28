package com.java.kalpesh.java_eight.repeatingannotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Games.class)
public interface Game {
	String name();

	String day();
}

//Declaring container for repeatable annotation type  
@Retention(RetentionPolicy.RUNTIME)
public interface Games {
	Game[] value();
}