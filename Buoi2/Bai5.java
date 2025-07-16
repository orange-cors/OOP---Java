package Buoi2;

public class Bai5 {
    public static void main(String[] args) {
        System.out.print("Bang cuu chuong:\n");
        for(int i = 0; i <=10; i++) {
            System.out.print("5x" + i + " = " + (5 * i) + "\n");
        }

        System.out.print("Tinh tong bang For:\n");
        int TongFor = 0;
        for(int i = 0; i <=100; i+=2) {
            TongFor += i;
        }System.out.print("Tong cac so chan tu 0 den 100 la: " + TongFor + "\n");

        System.out.print("Tinh tong bang While:\n");
        int i = 0;
        int TongWhile = 0;
        while(i <= 100) {
            TongWhile += i;
            i += 2;
        }System.out.print("Tong cac so chan tu 0 den 100 la: " + TongWhile + "\n");
    }    
}
