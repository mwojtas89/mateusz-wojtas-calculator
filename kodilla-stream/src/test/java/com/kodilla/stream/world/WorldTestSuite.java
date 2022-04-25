package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testPeopleQuantyty() {
        //Given
        Country poland = new Country (new BigDecimal("40123"));
        Country germany = new Country(new BigDecimal("67123"));
        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(germany);
        Country usa = new Country(new BigDecimal("55443322"));
        Country canada = new Country(new BigDecimal("66553322"));
        Continent america = new Continent();
        america.addCountry(usa);
        america.addCountry(canada);
        //When
        World world = new World();
        BigDecimal test = world.getPeopleQuantity();
        //Then
        BigDecimal expected = new BigDecimal("211111110903703703670");
        assertEquals(expected, test);
    }
}
