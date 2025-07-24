package Buoi3;

import java.util.Scanner;

public class Docs1 {
    final static String vuong = "Square";
    final static String chunhat = "Rectangle";
    final static String tron = "Circle";

    public static void NhapvaKiemtra(){
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap loai vien gach (Square, Rectangle, Circle): ");
            String type = sc.nextLine();
            boolean check1 = vuong.equalsIgnoreCase(type);
            boolean check2 = chunhat.equalsIgnoreCase(type);
            boolean check3 = tron.equalsIgnoreCase(type);
            if(!check1 && !check2 && !check3){
                System.out.println("Hinh dang khong hop le.");
                return;
            }
            if(check1){
                System.out.println("Nhap canh vien gach: ");
                float canh = sc.nextFloat();
                System.out.println("Dien tich vien gach hinh vuong la: " + (canh * canh));
            }
            if(check2){
                System.out.println("Nhap chieu dai vien gach: ");
                float dai = sc.nextFloat();
                System.out.println("Nhap chieu rong vien gach: ");
                float rong = sc.nextFloat();
                if(dai < rong){
                    System.out.println("Chieu dai phai lon hon chieu rong.");
                    return;
                }
                System.out.println("Dien tich vien gach hinh chu nhat la: " + (dai * rong));
            }
            if(check3){
                System.out.println("Nhap ban kinh vien gach: ");
                float bankinh = sc.nextFloat();
                System.out.printf("Dien tich vien gach hinh tron la: %2." , (Math.PI * bankinh * bankinh));
            }
        }
    }
    public static void main(String[] args) {
        NhapvaKiemtra();
    }
}
