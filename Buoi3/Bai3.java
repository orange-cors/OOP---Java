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
            String kttrai = String.valueOf(str.charAt(trai));
            String ktphai = String.valueOf(str.charAt(phai));
            while (trai < phai) {
                check = kttrai.equalsIgnoreCase(ktphai);
                if (!check) {
                    break;
                }
                trai++;
                phai--;
            }
            if(check) {
                System.out.println("Chuoi la doi xung!");
            }else {
                System.out.println("Chuoi khong la doi xung!");
            }
            for(int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
        }

    }
}
