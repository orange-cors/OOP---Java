package Buoi7.Class.Bai3.p5;
import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static int check(Scanner sc, String message) {
        int value = 0;
        boolean valid;
        do {
            System.out.print(message);
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                valid = true;
            } else {
                System.out.println("Loi, vui long nhap so nguyen!");
                sc.next();
                valid = false;
            }
        } while (!valid);
        return value;
    }
    public static void main(String[] args) {
        try {
        int a = check(sc, "Nhap so nguyen a: ");
        int b = check(sc, "Nhap so nguyen b: ");

        float c = a/b;
        
        System.out.println("Ket qua: " + c);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Khong the chia cho 0");
        }   

    }
}
