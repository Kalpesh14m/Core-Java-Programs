package com.java.kalpesh.loggingdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerConfiguration {
	private static final LogManager logManager = LogManager.getLogManager();
	private static final Logger LOGGER = Logger.getLogger("confLogger");
	static {
		try {
			logManager.readConfiguration(new FileInputStream(
					"/home/abc/Kalpesh/New Java Code All/Demo Java/Static File/logFile.properties"));
		} catch (IOException exception) {
			LOGGER.log(Level.SEVERE, "Error in loading configuration", exception);
		}
	}

	public static void main(String[] args) {
		LOGGER.fine("Fine message logged");
	}
}

/*
 * You can provide configuration properties to a Logger using a configuration
 * file. This helps you to remove the configuration from the code and provides
 * an easy way to re-configure whenever it is required without changing the code
 * again and again. This flexibility is provided by the LogManager class.
 * 
 * handlers: used to set the default handlers for all the loggers. .level: sets
 * the default Level for all the loggers to ALL.
 * java.util.logging.ConsoleHandler.level: sets the default Level for all the
 * ConsoleHandler to ALL. java.util.logging.ConsoleHandler.formatter: sets the
 * default formatter for the ConsoleHandler to a SimpleFormatter.
 * confLogger.level: sets the default level of the Logger named confLogger to
 * ALL.
 * 
 * Please note that you can override these properties in the code.
 * 
 * LogManager.getLogManager(): This is a static factory method used to get a
 * LogManager object. There is a single global LogManager object that is used to
 * maintain a set of shared state about the Loggers and the log services.
 * 
 * void readConfiguration(InputStream ins): This method is used to reinitialize
 * the logging properties and re-read the logging configuration from the given
 * stream, which should be in java.util.Properties format.
 */