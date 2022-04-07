package com.kodilla.testing.calc;

public class Calculator {
    int a;
    int b;
    int resultAdd;
    int resultSubstract;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add () {
        resultAdd = a+b;
    }

    public void substract () {
        resultSubstract = a-b;
    }

    public int getResultAdd() {
        return resultAdd;
    }

    public int getResultSubstract() {
        return resultSubstract;
    }
}
