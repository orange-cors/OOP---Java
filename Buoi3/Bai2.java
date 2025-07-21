package Buoi3;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        final double PI = 3.14159265;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Nhap ban kinh r: ");
            double r = sc.nextDouble();
            System.out.print("Nhap so mu k: ");
            int k = sc.nextInt();
            double chuVi = 2 * PI * r;
            double dienTich = PI * r * r;
            double rMuK = Math.pow(r, k);
            double can2 = Math.sqrt(r + k);
            double tritd = Math.abs(r - k);
            System.out.printf("Chu vi hinh tron: %.2f%n", chuVi);
            System.out.printf("Dien tich hinh tron: %.2f%n", dienTich);
            System.out.printf("R mu %d: %.2f%n", k, rMuK);
            System.out.printf("Can bac 2 cua (r + k): %.2f%n", can2);
            System.out.printf("Tri tuyet doi cua (r - k): %.2f%n", tritd);
        }    
    }
}    
