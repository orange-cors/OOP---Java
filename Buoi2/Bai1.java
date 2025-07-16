package Buoi2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        String ten;
        int tuoi;
        float chieuCao;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap ten cua ban: ");
            ten = sc.nextLine();

            System.out.print("Nhap tuoi cua ban: ");
            tuoi = sc.nextInt();

            System.out.print("Nhap chieu cao cua ban: ");
            chieuCao = sc.nextFloat();
        }

        System.out.printf("Xin chao [%s], ban [%d] tuoi va cao [%.2f] met.%n", ten, tuoi, chieuCao);
    }
}
