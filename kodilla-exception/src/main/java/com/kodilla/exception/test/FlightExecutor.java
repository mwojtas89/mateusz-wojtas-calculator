package com.kodilla.exception.test;

public class FlightExecutor {
    public static void main(String[] args) {
        Flight flight2 = new Flight("London", "Warsaw");
        FlightFinder test = new FlightFinder();
        try {
            test.findFilght(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Nie ma takiego lotu");
        }
        finally {
            System.out.println("Koniec programu");
        }

    }
}
