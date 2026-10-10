package com.hitms.lms.demo;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/** Writes progress messages to app.log using java.util.logging. */
public final class LoggingDemo {

    private static final Logger LOGGER = Logger.getLogger(LoggingDemo.class.getName());

    private LoggingDemo() {
        // Utility class; do not instantiate.
    }

    /** Configures file logging and writes two progress events. */
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("app.log", false);
        fileHandler.setFormatter(new SimpleFormatter());
        LOGGER.setUseParentHandlers(false);
        LOGGER.addHandler(fileHandler);
        try {
            LOGGER.info("Starting process...");
            LOGGER.info("Step completed.");
        } finally {
            LOGGER.removeHandler(fileHandler);
            fileHandler.close();
        }
    }
}
