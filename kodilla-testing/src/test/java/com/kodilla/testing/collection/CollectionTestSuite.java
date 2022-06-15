package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("When created OddNumbersExaminator with out values, " +
            "then even List should be empty")

    @Test
    void testCaseEmptyList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator examin = new OddNumbersExterminator();
        //When
        List<Integer> result = new ArrayList<>();
        result = examin.exterminate(numbers);
        //Then
        Assertions.assertEquals(numbers, result);
    }

    @DisplayName("When created OddNumbersExaminator with odd and even values, " +
            "then result should give us even list")

    @Test
    void testCaseNormalList() {
        //Given
        Random a = new Random();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> result;
        List<Integer> test = new ArrayList<>();
        OddNumbersExterminator examin = new OddNumbersExterminator();
        for (int i = 0; i < 10; i++) {
            numbers.add(a.nextInt( 200));
        }
        //When
        OddNumbersExterminator examin1 = new OddNumbersExterminator();
        result = examin1.exterminate(numbers);
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                test.add(num);
            }
        }
        //Then
        Assertions.assertEquals(test, result);
    }
}
