package Buoi7.Docs23;
import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(new Student("1", "Alice", 8.5, 20, "mango.cors@gmail.com", "Class A2", "1223 Street"));
        studentManager.addStudent(new Student("2", "Alic21e", 8.35, 220, "man2go.cors@gmail.com", "Class A1", "2123 Street"));
        studentManager.addStudent(new Student("3", "Alic2e", 8.25, 230, "man22go.cors@gmail.com", "Class A3", "1223 Street"));
        studentManager.addStudent(new Student("4", "Alic3e", 8.55, 240, "mang2o.cors@2gmail.com", "Class A4", "12232 Street"));
        studentManager.addStudent(new Student("5", "Alic23e", 8.45, 2550, "ma2ngo.cors@gmail.com", "Class A5", "1232 Street"));
        studentManager.addStudent(new Student("6", "Alice4", 8.15, 2330, "mango.cors2@gmail.com", "Class A8", "1232 Street"));

        int choose;
        do{
            System.out.printf("\n====== QUAN LY HOC SINH =======%n1. In danh sach hoc sinh%n2. Sap xep theo diem giam dan%n3. Sap xep theo diem tang dan%n4. Tim hoc sinh theo ten%n5. Thoat!%n");
            System.out.println("Chon chuc nang: ");
            choose= sc.nextInt();
            if(choose == 1){
                studentManager.printStudents();
            }
            if(choose == 2){
                System.out.println("Danh sach sau khi da sap xep giam dan!");
                studentManager.sortByScoreDesc();
                studentManager.printStudents();
            }
            if(choose == 3){
                System.out.println("Danh sach sau khi da sap xep giam dan!");
                studentManager.sortByScoreAsc();
                studentManager.printStudents();
            }
            if(choose == 4){
                System.out.println("Nhap ten sinh vien: ");
                sc.nextLine();
                String name = sc.nextLine();
                Student student = studentManager.findByName(name);
                if(student != null){
                    System.out.printf("Thong tin sinh vien can tim la: %nID: %s%nName: %s%nScore: %.2f%nAge: %d%nEmail: %s%nClass Name: %s%nAddress: %s%nGrade: %s%n",
                            student.getId(), student.getName(), student.getScore(), student.getAge(), student.getEmail(), student.getClassName(), student.getAddress(), student.getGrade());
                } else {
                    System.out.println("Khong tim thay sinh vien!");
                }
            }
            if(choose == 5){
                System.out.println("Exit");
                break;
            }
        }
        while (choose >0);
    }
}
