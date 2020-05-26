package com.java.kalpesh.loggingdemo;

import java.util.logging.Filter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LoggerFilter implements Filter {
	private static final Logger LOGGER = Logger.getLogger(LoggingDemo1.class.getName());

	public static void main(String[] args) {
		// Setting filter FilterExample
		LOGGER.setFilter(new LoggerFilter());
		// Since this message string does not contain the word important. Despite of
		// being the Level SEVERE this will be ignored
		LOGGER.severe("This is SEVERE message");
		// This will get published
		LOGGER.warning("This is important warning message");

	}

	// This method will return true only if the LogRecord object contains the
	// message which contains the word important
	@Override
	public boolean isLoggable(LogRecord record) {
		if (record == null)
			return false;

		String message = record.getMessage() == null ? "" : record.getMessage();

		if (message.contains("important"))
			return true;

		return false;
	}

}

/*
 * A Filter is an interface in java.util.logging package. It is used to control
 * the messages to be logged by the handler. Every Logger and Handler optionally
 * can have a Filter. The Filter has a isLoggable method which returns a
 * boolean. Before publishing the message the Logger or the Handler calls this
 * method, if the method returns true the LogRecord gets publish else it gets
 * ignored.
 * 
 * void setFilter(Filter newFilter): This method sets a Filter which controls
 * the output on this Logger.
 * 
 * boolean isLoggable(LogRecord record): This method is from the Filter
 * interface which checks if a given LogRecord object should be published or
 * not.
 */
