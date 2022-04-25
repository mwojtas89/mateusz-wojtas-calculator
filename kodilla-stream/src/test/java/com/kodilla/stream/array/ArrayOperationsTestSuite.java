package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testArray () {
        //Given
        int [] test = {1,2,3,4,5,6,7,8,9};
        //When
        double testAvrage = ArrayOperations.getAverage(test);
        //Then
        double expected = 5;
        assertEquals(expected, testAvrage);

    }
}
