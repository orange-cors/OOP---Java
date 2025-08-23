package Buoi7.Class.Bai3.p1;

public class Manager extends Employee {
    @Override
    public double salary(double hours, double rate) {
        return super.salary(hours, rate) + 1000;
    }
    
}
