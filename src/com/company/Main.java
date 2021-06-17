package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle aa = new Rectangle(2,4);
        Rectangle aa1 = new Rectangle(5,3);
        Rectangle aa2 = new Rectangle(1,9);
        Rectangle aa3 = new Rectangle(4,4);
        Rectangle aa4 = new Rectangle(3,4);

        ArrayRectangles aaa = new ArrayRectangles();
        aaa.addRectangle(aa);
        aaa.addRectangle(aa1);
        aaa.addRectangle(aa2);
        aaa.addRectangle(aa3);
        aaa.addRectangle(aa4);
        System.out.println(aa3.area());
        System.out.println(aa1.isSquare());
        System.out.println(aaa.numberMaxArea());
        System.out.println(aaa.numberMinPerimeter());
        System.out.println(aaa.numberSquares());

    }
}
