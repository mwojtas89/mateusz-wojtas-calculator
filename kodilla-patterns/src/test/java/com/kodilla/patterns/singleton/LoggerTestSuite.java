package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void addingLogs () {
        logger = Logger.INSTANCE;
        logger.log("New log");
    }

    @Test
    void getLastLogTest () {
        //Given
        //When
        String test = logger.getLastLog();
        System.out.println("Last log : " + test);
        //Then
        Assertions.assertEquals("New log", test);
    }
}
