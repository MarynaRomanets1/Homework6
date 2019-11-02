package com.epam.homework_6_1;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcArea() {
        return 0.0;
    }

    @Override
    public void draw() {
        System.out.println(this.toString() + ", radius = " + radius);
    }
    @Override
    public double countSquare() {
        double counterSquare = Math.PI * this.radius * this.radius;
        return counterSquare;
    }

}
