package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User adam = new Millenials("Adam Lambert");
        User ewa = new YGeneration("Ewa Bem");
        User tomek = new ZGeneration("Tomasz Bolkowski");
        //When
        String adamIsUsing = adam.scharePost();
        System.out.println("Adam is using : " + adamIsUsing);
        String ewaIsUsing = ewa.scharePost();
        System.out.println("Ewa is using : " + ewaIsUsing);
        String tomekIsUsing = tomek.scharePost();
        System.out.println("Tomke is using : " + tomekIsUsing);
        //Then
        Assertions.assertEquals("Facebook", adamIsUsing);
        Assertions.assertEquals("Snapchat", ewaIsUsing);
        Assertions.assertEquals("Twitter", tomekIsUsing);
    }

    @Test

    void testIndividualSharingStrategy() {
        //Given
        User adam = new ZGeneration("Adam Testowy");
        //When
        String adamIsUsing = adam.scharePost();
        System.out.println("Before change : " + adamIsUsing);
        adam.setSocialPublisher(new FacebookPublisher());
        adamIsUsing = adam.scharePost();
        System.out.println("After change : " + adamIsUsing);
        //Then
        Assertions.assertEquals("Facebook", adamIsUsing);
    }
}
