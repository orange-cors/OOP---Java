package Buoi3;
import java.util.Scanner;
public class Docs3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            double a = Math.random()*100.01;
            double b = Math.random()*100.01;
            double c = Math.random()*200.01;
            System.out.print("Du doan cua ban la(dung/sai): ");
            String nhap = sc.nextLine();
            boolean check = nhap.equalsIgnoreCase("dung");
            boolean check1 = nhap.equalsIgnoreCase("sai");
            System.out.printf("Phep toan cua ban la: %.0f + %.0f = %.0f\n", a, b, c);
            if(check){
                if(a + b == c) {
                    System.out.println("Du doan cua ban la dung!");
                } else {
                    System.out.println("Du doan cua ban la sai!");
                }
            } else if(check1||a+b!=c) {
                if(a + b != c) {
                    System.out.println("Du doan cua ban la dung!");
                } else {
                    System.out.println("Du doan cua ban la sai!");
                }
            } else {
                System.out.println("Nhap khong hop le, vui long nhap 'dung' hoac 'sai'.");
            }
        }
    }
}
