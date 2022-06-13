package com.kodilla.patterns.enums.hotel;

import java.math.BigDecimal;
import java.util.Map;

public class PriceList {
    public static Map<Season, BigDecimal> singleBedPrices = Map.of(
            Season.LOW, new BigDecimal(250),
            Season.HIGH, new BigDecimal(320),
            Season.HOLIDAY, new BigDecimal(400)
    );

    public static Map<Season, BigDecimal> doubleBedPrices = Map.of(
            Season.LOW, new BigDecimal(350),
            Season.HIGH, new BigDecimal(400),
            Season.HOLIDAY, new BigDecimal(500)
    );

    public static BigDecimal getSingleBedPrices (Season season) {
        return singleBedPrices.get(season);
    }

    public static BigDecimal getDoubleBedPrices (Season season) {
        return doubleBedPrices.get(season);
    }
}
