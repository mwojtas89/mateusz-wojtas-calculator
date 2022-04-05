package com.kodilla.testing;

import com.kodilla.testing.calc.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main (String[] args){
            SimpleUser simpleUser = new SimpleUser("theForumUser");

            String result = simpleUser.getUsername();

            if (result.equals("theForumUser")) {
                System.out.println("test OK");
            } else {
                System.out.println("Error!");
            }

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
