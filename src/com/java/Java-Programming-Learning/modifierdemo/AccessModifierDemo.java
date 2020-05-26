package com.java.kalpesh.modifierdemo;

public class AccessModifierDemo {

}
/*
 * Modifiers are keywords that you add to those definitions to change their
 * meanings. Java language has a wide variety of modifiers, including the
 * following −
 * 
 * Java Access Modifiers
 * 
 * Non Access Modifiers
 * 
 * 
 * Default ==> Java provides a number of access modifiers to set access levels
 * for classes, variables, methods, and constructors. The four access levels are
 * 
 * Visible to the package, the default. No modifiers are needed. Visible to the
 * class only (private). Visible to the world (public). Visible to the package
 * and all subclasses (protected). Default Access Modifier - No Keyword Default
 * access modifier means we do not explicitly declare an access modifier for a
 * class, field, method, etc.
 * 
 * A variable or method declared without any access control modifier is
 * available to any other class in the same package. The fields in an interface
 * are implicitly public static final and the methods in an interface are by
 * default public. String version = "1.5.1";
 * 
 * boolean processOrder() { return true; }
 * 
 * 
 * Private Access Modifier ==> Private Methods, variables, and constructors that
 * are declared private can only be accessed within the declared class itself.
 * 
 * Private access modifier is the most restrictive access level. Class and
 * interfaces cannot be private.
 * 
 * Variables that are declared private can be accessed outside the class, if
 * public getter methods are present in the class.
 * 
 * Using the private modifier is the main way that an object encapsulates itself
 * and hides data from the outside world.
 * 
 * public class Logger { private String format;
 * 
 * public String getFormat() { return this.format; }
 * 
 * public void setFormat(String format) { this.format = format; } }
 * 
 * Public Access Modifier ==> Public A class, method, constructor, interface,
 * etc. declared public can be accessed from any other class. Therefore, fields,
 * methods, blocks declared inside a public class can be accessed from any class
 * belonging to the Java Universe.
 * 
 * However, if the public class we are trying to access is in a different
 * package, then the public class still needs to be imported. Because of class
 * inheritance, all public methods and variables of a class are inherited by its
 * subclasses.
 * 
 * 
 * public static void main(String[] arguments) { // ... }
 * 
 * Protected Access Modifier ==> Protected Variables, methods, and constructors,
 * which are declared protected in a superclass can be accessed only by the
 * subclasses in other package or any class within the package of the protected
 * members' class.
 * 
 * The protected access modifier cannot be applied to class and interfaces.
 * Methods, fields can be declared protected, however methods and fields in a
 * interface cannot be declared protected.
 * 
 * Protected access gives the subclass a chance to use the helper method or
 * variable, while preventing a nonrelated class from trying to use it. class
 * AudioPlayer { protected boolean openSpeaker(Speaker sp) { // implementation
 * details } }
 * 
 * class StreamingAudioPlayer { boolean openSpeaker(Speaker sp) { //
 * implementation details } }
 * 
 * Access Control and Inheritance The following rules for inherited methods are
 * enforced ==>
 * 
 * Methods declared public in a superclass also must be public in all
 * subclasses.
 * 
 * Methods declared protected in a superclass must either be protected or public
 * in subclasses; they cannot be private.
 * 
 * Methods declared private are not inherited at all, so there is no rule for
 * them.
 */
