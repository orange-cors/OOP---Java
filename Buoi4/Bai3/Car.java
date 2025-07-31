package Buoi4.Bai3;

public class Car {
    private String brand;
    private int maxspeed;

    public Car(String brand, int maxspeed) {
        this.brand = brand;
        this.maxspeed = maxspeed;
    }
    public int getSpeed() {
        return maxspeed;
    }
    void run() {
        System.out.println("Xe [" + brand + "] dang chay voi toc do toi da [" + maxspeed + "] km/h");
    }
}
