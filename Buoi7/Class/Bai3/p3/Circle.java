package Buoi7.Class.Bai3.p3;

public class Circle extends Shape {
    private double r;
    public Circle(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * r * r;
    }

}
