package com.kodilla.testing;

import com.kodilla.testing.calc.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestingMain {
    public static void main (String[] args){

        Random a = new Random();

        List<Integer> numbers = new ArrayList<>();
        List<Integer> result;

        for (int i = 0; i<10; i++) {
            numbers.add(a.nextInt(200));
        }

        OddNumbersExterminator examin = new OddNumbersExterminator();
        result = examin.exterminate(numbers);

        for (Integer print : result) {
            System.out.println(print);
        }

        Integer b[] = new Integer[] {10,20,30,40,50,60,70,80,90};
        List<Integer> bList = Arrays.asList(b);
        System.out.println("List is : " + bList);

        Calculator calculator = new Calculator(10,20);
        calculator.add();
        if (calculator.getResultAdd()==30) {
            System.out.println("Test OK wynik: " + calculator.getResultAdd());
        } else {
            System.out.println("Error wynik: " + calculator.getResultAdd());
        }
        calculator.substract();
        if (calculator.getResultSubstract()==-10) {
            System.out.println("Test OK wynik: " + calculator.getResultSubstract());
        } else {
            System.out.println("Error wynik: " + calculator.getResultSubstract());
        }
    }
}
