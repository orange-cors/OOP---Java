package Buoi3;
import java.util.Scanner;

public class Bai1 {

    public static void nhapMang(int[] a, int n, Scanner sc){
            for(int i=0;i<n;i++){
                System.out.print("a[" + i + "]: ");
                a[i]= sc.nextInt();
            }
    }

    public static void TongChan(int[] a, int n){
        int tong = 0;
        int dem = 0;
        for(int i=0;i<n;i++){
            if(a[i] % 2 == 0) {
                tong += a[i];
                dem++;
            }
        }System.out.println("\nCo " + dem + " so chan! Tong cac phan tu chan la: " + tong);
    }

    public static void TongLe(int[] a, int n){
        int tong = 0;
        int dem = 0;
        for(int i=0;i<n;i++){
            if(a[i] % 2 != 0) {
                tong += a[i];
                dem++;
            }
        }System.out.println("\nCo " + dem + " so le! Tong cac phan tu le la: " + tong);
    }

    public static boolean KiemTra(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void SoNguyenTo(int[] a, int n){
        int dem = 0;
        for(int i = 0; i < n; i++) {
            if (KiemTra(a[i])) {
                dem++;
            }
        }System.out.println("\nCo " + dem + " so nguyen to trong mang!");
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
        TongChan(a, n);
        TongLe(a, n);
        SoNguyenTo(a, n);
        }
    }
}