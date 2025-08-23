package Buoi7.Class.Bai1.p4;
import java.util.Scanner;
public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
        System.out.print("Nhap so nguyen a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen b: ");
        int b = sc.nextInt();

        int c = a/b;

        System.out.println("Ket qua a/b = " + c);
        } catch (Exception e){
            
            System.out.println("Loi: Khong the chia cho 0 hoac nhap sai du lieu");
        }

    }
}
