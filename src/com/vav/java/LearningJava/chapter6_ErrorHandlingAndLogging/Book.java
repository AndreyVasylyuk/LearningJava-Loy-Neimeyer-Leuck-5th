package com.vav.java.LearningJava.chapter6_ErrorHandlingAndLogging;

import java.util.logging.Logger;

public class Book {
    static Logger log = Logger.getLogger("com.oreilly.learnjava.Book");

    public static void main(String[] args) {
        log.warning("Disk 90% full.");
        log.info("New user joined chat room.");
    }
}
