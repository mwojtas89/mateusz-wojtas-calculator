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

    public int add () {
        return resultAdd = a+b;
    }

    public int substract () {
        return resultSubstract = a-b;
    }

    public int getResultAdd() {
        return resultAdd;
    }

    public int getResultSubstract() {
        return resultSubstract;
    }
}
