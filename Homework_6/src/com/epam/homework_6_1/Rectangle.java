package com.epam.homework_6_1;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
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
        System.out.println(this.toString() + ", width = " + width + ", height = " + height);
    }
    @Override
    public double countSquare() {
        double counterSquare = this.width * this.height;
        return counterSquare;
    }
}
