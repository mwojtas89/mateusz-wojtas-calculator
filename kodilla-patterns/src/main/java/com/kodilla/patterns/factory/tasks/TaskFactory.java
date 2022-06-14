package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING_TASK = "DRIVING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";

    public final Task makeTask (final String taskClass) {
        switch (taskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Drive to mom", "Cracov", "Car");
            case PAINTING_TASK:
                return new PaintingTask("Paint the room", "white","living room");
            case SHOPPING_TASK:
                return new ShoppingTask("Buy new computer", "apple macbook pro",1.0);
            default:
                return null;
        }
    }
}
