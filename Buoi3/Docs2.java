package Buoi3;
import java.util.Scanner;
public class Docs2 {
    public static void kiemTraChuoi(String Str) {
        boolean check = true;
        int trai = 0, phai = Str.length() - 1;
        String kttrai = String.valueOf(Str.charAt(trai));
        String ktphai = String.valueOf(Str.charAt(phai));
        while (trai < phai) {
            check = kttrai.equalsIgnoreCase(ktphai);
            if (!check) {
                break;
            }
            trai++;
            phai--;
        }
        if(check) {
            String STR = Str.toUpperCase();
            System.out.println("Chuoi in hoa: " + STR + " Chuoi la doi xungS!");

        }else {
            String str = Str.toLowerCase();
            System.out.println("Chuoi in thuong: " + str + " Chuoi khong doi xung!");
        }    
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String Str;
            System.out.print("Nhap chuoi: ");
            Str = sc.nextLine();
            kiemTraChuoi(Str);    
        }

    }
}
