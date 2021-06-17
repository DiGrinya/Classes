package com.company;

public class ArrayRectangles {

    private Rectangle [] rectangleArray;

    public ArrayRectangles(int a){

        rectangleArray = new Rectangle[a];
    }

    public ArrayRectangles( Rectangle... rectangle){
        rectangleArray = rectangle;
    }

    public boolean addRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangleArray.length ; i++) {
            if (rectangleArray[i]==null) {
                rectangleArray[i] = rectangle;
                return true;
            }
        }  return false;
    }

    public int numberMaxArea() {
        int max = 0;
        double tmp = 0;
        for (int i = 0; i < rectangleArray.length ; i++) {
            if (rectangleArray[i].area() >= tmp) {
                tmp = rectangleArray[i].area();
                max = i;
            }
        }
        return max;
    }

    public int numberMinPerimeter() {
        int min = 0;
        double tmp = 1000;
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i].perimeter() <= tmp) {
                tmp = rectangleArray[i].perimeter();
                min = i;
            }
        }
        return min;
    }

    public int numberSquares() {

        int count = 0;
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i].isSquare()) count++;
        }
        return count;
    }
}

