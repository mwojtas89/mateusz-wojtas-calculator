package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continentList = new ArrayList<>();

    public void addContinent (Continent continent) {
        continentList.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal output = continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPopulation)
                .reduce(BigDecimal.ZERO , (sum,curent) -> sum = sum.add(curent));
        return output;
    }
}
