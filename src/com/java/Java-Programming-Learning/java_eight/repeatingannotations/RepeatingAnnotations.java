package com.java.kalpesh.java_eight.repeatingannotations;
//Declaring repeatable annotation type  

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



//Repeating annotation  
@Game(name = "Cricket", day = "Sunday")
@Game(name = "Hockey", day = "Friday")
@Game(name = "Football", day = "Saturday")

public class RepeatingAnnotations {
	public static void main(String[] args) {  
        // Getting annotation by type into an array  
        Game[] game = RepeatingAnnotationsExample.class.getAnnotationsByType(Game.class);  
        for (Gamegame2 : game) {    // Iterating values  
            System.out.println(game2.name()+" on "+game2.day());  
        }  
    }
}
