package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String figureName;
    private double field;

    public Triangle(String figureName, double field) {
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
