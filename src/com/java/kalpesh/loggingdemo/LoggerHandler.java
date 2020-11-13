package com.java.kalpesh.loggingdemo;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerHandler {
	private static final Logger LOGGER = Logger.getLogger(LoggerHandler.class.getName());

	public static void main(String[] args) {

		Handler consoleHandler = null;
		Handler fileHandler = null;
		try {
			// Creating consoleHandler and fileHandler
			consoleHandler = new ConsoleHandler();
			fileHandler = new FileHandler(
					"/home/abc/Kalpesh/New Java Code All/Demo Java/Static File/LogFiles/logFile.log");

			// Assigning handlers to LOGGER object
			LOGGER.addHandler(consoleHandler);
			LOGGER.addHandler(fileHandler);

			// Setting levels to handlers and LOGGER
			consoleHandler.setLevel(Level.ALL);
			fileHandler.setLevel(Level.ALL);
			LOGGER.setLevel(Level.ALL);

			LOGGER.config("Configuration done.");

			// Console handler removed
			LOGGER.removeHandler(consoleHandler);

			LOGGER.log(Level.FINE, "Finer logged");
		} catch (IOException exception) {
			LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
		}

		LOGGER.finer("Finest example on LOGGER handler completed.");

	}
}
/*
 * A Handler is one of the components of the logging framework. It is
 * responsible for printing the log message at a target destination. The
 * destination can be a console or a file. The Handler is used to take a log
 * message in the form of a LogRecord object and export it to the target
 * destination.
 * 
 * A Logger can be associated with one or more handlers that eventually forward
 * the logged message to all the handlers. A Handler is an abstract class in the
 * java.util.logging package which is a base class for all types of handlers in
 * Java. There are 4 types of built-in handlers in Java.
 * 
 * ConsoleHandler: A ConsoleHandler records all the log messages to System.err.
 * By default, a Logger is associated with this handler.
 * 
 * FileHandler: A FileHandler is used to record all the log messages to a
 * specific file or to a rotating set of files.
 * 
 * StreamHandler: A StreamHandler publishes all the log messages to an
 * OutputStream.
 * 
 * SocketHandler: The SocketHandler publish the LogRecords to a network stream
 * connection.
 * 
 * MemoryHandler: It is used to keep the LogRecords into a memory buffer. If the
 * buffer gets full, the new LogRecords starts overwriting the old LogRecords.
 * 
 * 
 * ConsoleHandler(): A constructor that creates a ConsoleHandler for System.err.
 * 
 * FileHandler(String pattern): A constructor that creates a FileHandler to log
 * messages in the given file name.
 * 
 * void addHandler(Handler handler): It’s an instance method from the Logger
 * class which is used to assign a handler to the logger object. You can assign
 * multiple handlers to a single logger object. Like in this example, we have
 * assigned both ConsoleHandler and FileHandler to a single logger object.
 * 
 * void setLevel(Level newLevel): This method is from the Logger and the Handler
 * class. It sets the log level specifying which message levels will be logged
 * by this logger. Message levels lower than the level set will be ignored.
 * 
 * void removeHandler(Handler handler): It is used to remove the associated
 * handler from the logger object. Once the handler is removed, it will not be
 * able to publish any further logs. In this example, we removed the
 * ConsoleHandler and all messages following it did not get published in the
 * console.
 * 
 * void finer(String msg): This instance method is used to log a FINER message,
 * if the logger is currently enabled for the FINER message else the logged
 * message gets ignored.
 * 
 * The log messages published by the FileHandler in the above example are in the
 * XML format. It’s the default format of the FileHandler. We can change the
 * format of the handler using a Formatter. In the next section, we will discuss
 * about the Formatter class and its uses.
 */