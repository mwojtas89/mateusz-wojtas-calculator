package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double CalculateAvrage() {
        double sum = 0;
        double av = 0;

        for (Map.Entry<String, Double> avrage : temperatures.getTemperatures().entrySet()) {
            sum = sum + avrage.getValue();
        }
        av = sum / temperatures.getTemperatures().size();
        return av;
    }
    public double CalculateMedian() {
        double outPut;
        List<Double> tempList = new ArrayList<>();
        for (Double valueForList : temperatures.getTemperatures().values()) {
            tempList.add(valueForList);
        }
        Collections.sort(tempList);
        if (tempList.size() % 2 != 0) {
            int test1 = tempList.size()/2;
            outPut = tempList.get(test1);
        } else {
            int test2 = (tempList.size() / 2);
            int test3 = (tempList.size() / 2)+ 1;
            outPut = (tempList.get(test2)+tempList.get(test3))/2;
        }
        return outPut;
    }
}
