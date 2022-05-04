package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    public void findFilght(Flight flight) throws RouteNotFoundException {
        HashMap <String, Boolean> flightList = new HashMap<String, Boolean>();
        flightList.put("Warsaw", true);
        flightList.put("London", true);
        flightList.put("Tokio", false);
        flightList.put("Berlin", true);
        flightList.put("Prague", false);
        if (flightList.get(flight.getArrivalAirport()) == null) {
            throw new RouteNotFoundException();
        } else {
            System.out.println(flightList.get(flight.getArrivalAirport()));

        }


    }
}
