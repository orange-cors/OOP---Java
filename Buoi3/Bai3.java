package Buoi3;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str;
            System.out.print("Nhap chuoi: ");
            str = sc.nextLine();
            String xoa = str.trim();
            System.out.println("Chuoi sau khi xoa khoang trang: " + xoa);
            boolean check = true;
            int trai = 0, phai = str.length() - 1;
            while (trai < phai) {
                if (str.charAt(trai) != str.charAt(phai)) {
                    check = false;
                }
                trai++;
                phai--;
            }
            if(check) {
                System.out.println("Chuoi la doi xung!");
            }else {
                System.out.println("Chuoi khong la doi xung!");
            }
        }

    }
}
