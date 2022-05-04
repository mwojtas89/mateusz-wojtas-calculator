package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuit {
    @Test
    void testX() {
        // given
        SecondChallenge sc = new SecondChallenge();
        // when & then
        assertAll(
                () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(2,0)),
                () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(0,0)),
                () -> assertDoesNotThrow( () -> sc.probablyIWillThrowException(1,0))
                );

    }

    @Test
    void testY() {
        // given
        SecondChallenge sc = new SecondChallenge();
        // when & then
        assertAll(
                () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(1.5,1.5)),
                () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(1,1.5)),
                () -> assertDoesNotThrow( () -> sc.probablyIWillThrowException(1,2))
        );

    }
}
