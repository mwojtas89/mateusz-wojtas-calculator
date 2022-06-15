package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {
    @Test
    void bigMacTestSuite () {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Bun")
                .sauce("Standard")
                .burgers(2)
                .ingredients("Bekon")
                .ingredients("Tomato")
                .build();
        System.out.println(bigmac);
        //When
        int ingredientsQuantity = bigmac.getIngredients().size();
        //Then
        Assertions.assertEquals(2,ingredientsQuantity);
        Assertions.assertEquals(2,bigmac.getBurgers());
    }
}
