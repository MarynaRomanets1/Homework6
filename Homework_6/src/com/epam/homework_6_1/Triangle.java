package com.epam.homework_6_1;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println(this.toString() + ", a = " + a + ", b = " + b + ", c = " + c);
    }

    @Override
    public double countSquare() {
        double pGeron = (this.a + this.b + this.c) / 2;
        pGeron = pGeron * (pGeron - this.a) * (pGeron - this.b) * (pGeron - this.c);
        double counterSquare = Math.sqrt(pGeron);
        return counterSquare;
    }
}
