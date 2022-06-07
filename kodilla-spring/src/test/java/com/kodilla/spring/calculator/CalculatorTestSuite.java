package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Test
    void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(1,1);
        double subResult = calculator.sub(3,2.5);
        double divResult = calculator.div(5,4);
        double mulResult = calculator.mul(2,3);
        //Then
        assertEquals(2, addResult);
        assertEquals(0.5,subResult);
        assertEquals(1.25,divResult);
        assertEquals(6,mulResult);
    }
}
