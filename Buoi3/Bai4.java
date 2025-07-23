package Buoi3;
import java.util.Scanner;
public class Bai4 {

    public static int fibonacci(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        int n1 = 0, n2 = 1, k = 0;
        for (int i = 2; i <= n; i++) {
            k = n1 + n2;
            n1 = n2;
            n2 = k;
        }
        return k;
    }

    public static void IndayTinhtong(int n) {
        int tongle = 0;
        System.out.print("Day Fibonacci den so thu " + n + " la: ");
        for (int i = 0; i <= n; i++) {
            int fib = fibonacci(i);
            System.out.print( fib + " ");
            if (fib % 2 != 0) {
                tongle += fib;
            }
        }System.out.println("\nTong cac so le trong day Fibonacci den so thu " + n + " la: " + tongle);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Nhap n: ");
            int n = sc.nextInt();
            IndayTinhtong(n);
        }
    }
}
