package Buoi2;
import java.util.Scanner;
public class Docs1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            float r = sc.nextFloat();
            if(r <= 0 || r >= 1000) {
                System.out.println("Ban kinh khong hop le!");
                return;
            }
            float pi = 3.14f;
            System.out.printf("%n%.3f %.3f", 2 * pi * r, pi * r * r);
        }
    }
}
