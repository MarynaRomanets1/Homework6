package com.epam.homework_6_1;

public abstract class Shape {
    private String color;

    public Shape (String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getSimpleName() + ", color = "  + color;
    }
    
    public abstract double calcArea();

    public void draw() {
        System.out.println(this.toString());
    }

    public double countSquare() {
        System.out.println("Square " + this.getClass().getSimpleName() + " = ");
        return 0.0;
    }
}
