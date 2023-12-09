package com.khadri.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(Main.class);

		logger.fatal("Fatal logging");
		logger.error("Error logging");
		logger.warn("Warn logging");
		logger.info("Info logging");
		logger.debug("Debug logging");
		logger.trace("Trace logging");

	}
}
