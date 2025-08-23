package Buoi7.Home.Docs1;
import java.util.Scanner;
public class Bai1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s;
        System.out.println("Nhap chuoi: ");
        s = sc.nextLine();
        String Up = s.toLowerCase();
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Up.charAt(i) == 'a' || Up.charAt(i) == 'e' || Up.charAt(i) == 'i' || Up.charAt(i) == 'o' || Up.charAt(i) == 'u') {
                countA++;
            }
            if(Character.isUpperCase(s.charAt(i))) {
                countB++;
            }
        }
        System.out.println("So ky tu nguyen am la: " + countA);
        System.out.println("So ky tu in hoa la: " + countB);
    }
}