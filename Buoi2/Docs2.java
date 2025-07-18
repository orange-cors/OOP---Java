package Buoi2;
import java.util.Scanner;

public class Docs2 {

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

    public static void CMang(int[] a, int n){
        for(int i=1;i<n;i+=2){
            if(i != n-1) {
                a[i] += Math.abs(a[i-1] - a[i+1]);
            }
            else{
                a[i] += Math.abs(a[i-1]);
            }
        }
    }
    public static void main(String [] args){
        int n;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Nhap kich thuoc mang: ");
            n = sc.nextInt();
            if (n <= 0 || n> 10000) {
                System.out.println("Kich thuoc mang khong hop le.");
                return;
            }
        int []a = new int[n];
        nhapMang(a, n, sc);
        CMang(a, n);
        xuatMang(a, n);
        }
    }
}