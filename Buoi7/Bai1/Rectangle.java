package Buoi7.Bai1;
public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double area() {
        return width * length;
    }
}
