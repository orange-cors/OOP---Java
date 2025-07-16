package Buoi2;
import java.util.Scanner;

public class Bai4 {

    public static void nhapMang(int[] a, int n, Scanner sc){
            for(int i=0;i<n;i++){
                System.out.print("a[" + i + "]: ");
                a[i]= sc.nextInt();
            }
    }

    public static void xuatMang(int[] a, int n){
        System.out.print("Mang cua ban la: ");
        for(int i=0;i<n;i++){
                System.out.print(a[i] + " ");
            }
    }

    public static void SumAndMax(int[] a, int n){
        int tong = 0;
        int max = a[0];
        for(int i=0;i<n;i++){
                tong += a[i];
                if(a[i] > max) {
                    max = a[i];
                }
            }System.out.print("\nTong cac phan tu la " + tong + "\nGia tri lon nhat la " + max);
    }


    
    public static void main(String [] args){
        int n;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Nhap kich thuoc mang: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Kich thuoc mang phai lon hon 0.");
                return;
            }
        int []a = new int[n];
        nhapMang(a, n, sc);
        xuatMang(a, n);
        SumAndMax(a, n);
        }
    }
}