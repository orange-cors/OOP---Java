package Buoi4.Bai2;
import java.util.Scanner;

public class Bai2 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Student s = new Student("Khoi", 19);
        s.setName("Luyen");
        s.setAge(20);
        s.sayHello();
    }
}
