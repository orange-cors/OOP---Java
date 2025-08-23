package Buoi7.Class.Bai2.p4;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum1 = calc.sum(2, 3);
        double sum2 = calc.sum(2.5, 3.5);
        int sum3 = calc.sum(1, 2, 3);
        System.out.println("Sum of 2 and 3 (int): " + sum1);
        System.out.println("Sum of 2.5 and 3.5 (double): " + sum2);
        System.out.println("Sum of 1, 2 and 3 (int): " + sum3);
    }
}
