package com.kodilla.patterns.builder.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaTestSuite {

    @Test
    void testNewPizza(){
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("thin")
                .sauce("tomato")
                .ingredient("Salami")
                .ingredient("mushroom")
                .build();
        System.out.println(pizza);
        //When
        int ingredientsQuantity = pizza.getIngredients().size();
        //Then
        Assertions.assertEquals(3,ingredientsQuantity);
    }
}
