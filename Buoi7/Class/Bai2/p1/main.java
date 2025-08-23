package Buoi7.Class.Bai2.p1;
import java.util.Scanner;
import java.util.ArrayList;
public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        int n;
        System.out.print("Nhap so luong sach: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ten sach: ");
            String title = sc.nextLine();
            System.out.print("Nhap ten tac gia: ");
            String author = sc.nextLine();
            books.add(new Book(title, author));
        }
        for (Book book : books) {
            System.out.println("Ten sach: " + book.getTitle() + ", Tac gia: " + book.getAuthor());
        }

    }    
}
