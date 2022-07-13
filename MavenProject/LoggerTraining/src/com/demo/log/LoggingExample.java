package com.demo.log;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggingExample {

	static Logger logger = Logger.getLogger(LoggingExample.class.getName());

	public static void main(String[] args) {
		try {
			LogManager.getLogManager().readConfiguration(new FileInputStream("logging.properties"));
		} catch (SecurityException | IOException e1) {
			e1.printStackTrace();
		}
		logger.setLevel(Level.FINE);
		logger.addHandler(new ConsoleHandler());
		// adding custom handler
		logger.addHandler(new MyHandler());
		try {
			// FileHandler file name with max size and number of log files limit
			Handler fileHandler = new FileHandler(
			"C://Users//saptakpatil//Documents//workspace-spring-tool-suite-4-4.15.1.RELEASE//LoggerTraining//src//com//demo//log//logfiles//logger.log",
			1000, 5);
			fileHandler.setFormatter(new MyFormatter());
			// setting custom filter for FileHandler
			fileHandler.setFilter(new MyFilter());
			logger.addHandler(fileHandler);

			for (int i = 0; i < 2000; i++) {
				// logging messages
				logger.log(Level.INFO, " Msg : " + i);
			}
			logger.log(Level.CONFIG, " Config data : ");
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
	}
}