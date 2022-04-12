package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> list = new ArrayList<>();

    public void addFigure(Shape shape) {
        list.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (list.contains(shape)) {
            list.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n) {
        return list.get(n);
    }

    public String showFigures(){
        String text = "";
        for(Shape shape : list) {
            text = shape.getShapeName();
        }
        return text;
    }

    public int getListQuantity() {
        return list.size();
    }

}
