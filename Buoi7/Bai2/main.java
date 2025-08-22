package Buoi7.Bai2;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<Moveable> vehicles = new ArrayList<>();
        Bike bike = new Bike();
        Car car = new Car();
        vehicles.add(bike);
        vehicles.add(car);
        for (Moveable vehicle : vehicles) {
            vehicle.move();
        }
    }
}
