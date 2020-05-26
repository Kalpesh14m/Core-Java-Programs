package com.java.kalpesh.loggingdemo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingDemo1 {

	private static final Logger LOGGER = Logger.getLogger(LoggingDemo1.class.getName());

	public static void main(String[] args) throws SecurityException, IOException {

		LOGGER.info("Logger Name: " + LOGGER.getName());
		System.out.println("\n\n");
		LOGGER.warning("important : Can cause ArrayIndexOutOfBoundsException");
		// An array of size 3
		int[] a = { 1, 2, 3 };
		int index = 4;
		System.out.println("\n\n");
		LOGGER.config("index is set to " + index);

		try {
			System.out.println(a[index]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			LOGGER.log(Level.SEVERE, "Exception occur", ex);
		}
	}
}
/*
 * Logging in simple words refers to the recording of an application activity.
 * Logging is used to store exceptions, information, and warnings as messages
 * that occur during the execution of a program. Logging helps a programmer in
 * the debugging process of a program.
 * 
 * Java provides logging facility in the java.util.logging package. The package
 * consists of a set of classes and interfaces which are used in logging. The
 * System uses a Logger object to log messages.
 * 
 * The Logger object is allocated with a LogRecord object which stores the
 * message to be logged. This LogRecord object is forwarded to all the handlers
 * assigned to the Logger object. Both loggers and handlers can optionally use a
 * Filter that is associated with them, to filter the log messages. Then, the
 * handlers published the logged messages to the external system.
 * 
 * 
 * 
 * Logger and Level =>
 * 
 * A Logger class is used to create a logger object which is used to log
 * messages. A logger object is provided with a name and has a set of methods
 * which are used to log messages at the different levels. Although you can
 * provide any name to the logger, it is recommended to provide a name based on
 * the package and the class name in which the logger is created.
 * 
 * There are seven logging levels provided by the Level class.
 * 
 * • SEVERE (highest level) • WARNING • INFO • CONFIG • FINE • FINER • FINEST
 * (lowest level)
 * 
 * All these levels are present in the Level class, as a static final field. You
 * can use any of these levels, according to the level of the message you log.
 * Additionally, it also provides a level OFF that can be used to turn off the
 * logging and a level ALL to turn on the logging for all the levels.
 * 
 * Logger.getLogger(String name): This method is used to create or find a logger
 * by the name passed as a parameter.
 * 
 * void info(String msg): This instance method is used to log an INFO message,
 * if the logger is currently enabled for the INFO message else the logged
 * message is gets ignored.
 * 
 * void warning(String msg): This instance method is used to log a WARNING
 * message, if the logger is currently enabled for the WARNING message else the
 * logged message is gets ignored.
 * 
 * void config(String msg): This instance method is used to log a CONFIG
 * message, if the logger is currently enabled for the CONFIG message else the
 * logged message is gets ignored.
 * 
 * void log(Level level, String msg, Object param1): This method is used to log
 * a message with a given level, and with an Object as a parameter. You can use
 * this method when you want to store an object in the log as done in the above
 * example where we have logged an exception object at SEVERE level.
 */