package Buoi2;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        int a, b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap so a: ");
            a = sc.nextInt();
            System.out.print("Nhap so b: ");
            b = sc.nextInt();
        }
        System.out.printf("Tong cua %d va %d la: %d%n", a, b, a + b);
        System.out.printf("Hieu cua %d va %d la: %d%n", a, b, a - b);
        System.out.printf("Tich cua %d va %d la: %d%n", a, b, a * b);
        System.out.printf("Thuong cua %d va %d la: %.2f%n", a, b, 1.0 * a / b);
        System.out.printf("Chia lay du cua %d va %d la: %d%n", a, b, a % b);
        if(a==b) {
            System.out.printf("2 so nguyen vua nhap bang nhau!%n", a, b);
        }else {
            System.out.printf("2 so nguyen vua nhap khac nhau!", a, b);
        }
    }    
}
