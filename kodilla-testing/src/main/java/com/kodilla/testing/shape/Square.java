package com.kodilla.testing.shape;

public class Square implements Shape{
    private String figureName;
    private double field;

    public Square(String figureName, double field) {
        this.figureName = figureName;
        this.field = field;
    }

    @Override
    public double getField() {
        return field;
    }

    @Override
    public String getShapeName() {
        return figureName;
    }
}
