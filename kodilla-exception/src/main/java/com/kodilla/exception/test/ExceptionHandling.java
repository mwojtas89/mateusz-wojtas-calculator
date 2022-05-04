package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge sc = new SecondChallenge();
        try {
            sc.probablyIWillThrowException(2, 1.5);
        } catch (Exception e) {
            System.out.println("zle dane");
        }
    }
}
