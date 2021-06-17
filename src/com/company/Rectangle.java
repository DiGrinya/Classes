package com.company;

public class Rectangle {

    private double sideA;
    private double sideB;

    public Rectangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;
    }

    public Rectangle(double a) {
        this.sideA = a;
        this.sideB = 5;
    }

    public Rectangle() {
        this.sideA = 4;
        this.sideB = 3;
    }


    public double getSideA() {
        if (sideA<=0) {
            throw new UnsupportedOperationException();
        }
        return sideA;
    }

    public double getSideB() {
        if (sideB<=0) {
            throw new UnsupportedOperationException();
        }
        return sideB;
    }

    public double area() {
        if (sideA<=0||sideB<=0) {
            throw new UnsupportedOperationException();
        }
        return sideA * sideB;
    }

    public double perimeter() {
        if (sideA<=0||sideB<=0) {
            throw new UnsupportedOperationException();
        }
        return 2 * (sideA + sideB);
    }

    public boolean isSquare() {
        return (sideA==sideB);
    }

    public void replaceSides() {

        double tmp = sideA;
        sideA = sideB;
        sideB = tmp;
    }

}

