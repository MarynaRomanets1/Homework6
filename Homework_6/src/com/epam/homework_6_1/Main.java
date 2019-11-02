package com.epam.homework_6_1;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle("White", 5),
                new Rectangle("Green", 15, 10),
                new Triangle("Red", 5, 7, 10), //a+b>c  a+c>b b+c>a
                new Circle("Black", 6),
                new Rectangle("Purple", 15, 10),
                new Triangle("Blue", 8, 9, 11),
                new Rectangle("Brown", 10, 20),
                new Rectangle("Orange", 11, 5),
                new Circle("Grey", 4)
        };

        for (Shape elem : shapes) {
            elem.draw();
        }
        double square = getSquare(shapes);
        System.out.println("Square = " + square);
        getSquareShape(shapes);
    }

    static double getSquare(Shape[] array) {
        double square = 0;
        for (Shape elem : array ) {
            square += elem.countSquare();
        }
        square = Math.round(square * 100.0) / 100.0;
        return square;
    }
    static void getSquareShape(Shape[] array) {
        double squareCircle = 0;
        double squareRectangle = 0;
        double squareTriangle = 0;
        for (Shape elem : array ) {
            if (elem instanceof Shape) {
                if ((elem.getClass().getSimpleName()).equals("Circle")) {
                    squareCircle += elem.countSquare();
                }
                if ((elem.getClass().getSimpleName()).equals("Rectangle")) {
                    squareRectangle += elem.countSquare();
                }
                if ((elem.getClass().getSimpleName()).equals("Triangle")) {
                    squareTriangle += elem.countSquare();
                }
            }
        }
        System.out.println("Sum Circle square    = " + Math.round(squareCircle * 100.0) / 100.0 );
        System.out.println("Sum Rectangle square = " + Math.round(squareRectangle * 100.0) / 100.0);
        System.out.println("Sum Triangle square  = " + Math.round(squareTriangle * 100.0) / 100.0);
    }

}
