package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        //Then
        Assertions.assertEquals("Drive to mom", driving.getTaskName());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        //Then
        Assertions.assertEquals("Paint the room", painting.getTaskName());
        Assertions.assertEquals(false,painting.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        shopping.executeTask();
        //Then
        Assertions.assertEquals("Buy new computer", shopping.getTaskName());
        Assertions.assertEquals(true,shopping.isTaskExecuted());
    }
}
