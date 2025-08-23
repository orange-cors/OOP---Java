package Buoi7.Class.Bai1.p1;
import java.util.List;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        shapes.add(circle);
        shapes.add(rectangle);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
    }
}
