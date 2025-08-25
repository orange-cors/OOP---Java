package FinalTest.Bai1;

import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.nextLine();
        sc.nextLine();
        String s1 = s.toLowerCase();
        int count1=0;
        int count2=0;
        for(int i=0; i<s.length();i++){
            if(s1.charAt(i)==' '){
                count1++;
            }
        }
        for(int i=s.length()-1;i>0;i++){
            System.out.print(s.charAt(i));
        }
    }
}