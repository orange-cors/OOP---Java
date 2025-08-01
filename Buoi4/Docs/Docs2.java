package Buoi4.Docs;
import java.util.ArrayList;
import java.util.Scanner;
public class Docs2 {
    public static Scanner sc = new Scanner(System.in);

    public static void show(ArrayList<Student> list) {
        System.out.printf("%-20s %-10s %-20s %-10s %-10s %-10s %-10s %-10s\n", "Name", "Age", "Address", "TX1", "TX2", "KTHP", "GPA", "Day Off");
        for (Student s : list) {
            System.out.printf("%-20s %-10d %-20s %-10.2f %-10.2f %-10.2f %-10.2f %-10d\n", s.getName(), s.getYearOfBirth(), s.getAddress(), s.getTX1(), s.getTX2(), s.getKTHP(), (s.getTX1()*0.2 + s.getTX2()*0.3 + s.getKTHP()*0.5), s.getDayOff());
        }
    }

    public static void themSinhVien(ArrayList<Student> list) {
        sc.nextLine();
        System.out.print("Nhap ten: ");
        String name = sc.nextLine();

        System.out.print("Nhap nam sinh: ");
        int yearOfBirth = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap dia chi: ");
        String address = sc.nextLine();

        System.out.print("Nhap TX1: ");
        float tx1 = sc.nextFloat();

        System.out.print("Nhap TX2: ");
        float tx2 = sc.nextFloat();

        System.out.print("Nhap KTHP: ");
        float kthp = sc.nextFloat();

        System.out.print("Nhap so tiet nghi: ");
        int dayOff = sc.nextInt();

        list.add(new Student(name, yearOfBirth, address, tx1, tx2, kthp, dayOff));
        System.out.println(" Da them sinh vien moi!");
    }
    public static void suaSinhVien(ArrayList<Student> list) {
    sc.nextLine();
    System.out.print("Nhap ten sinh vien can sua: ");
    String name = sc.nextLine();

    boolean found = false;
    for (Student s : list) {
        if (s.getName().equalsIgnoreCase(name)) {
            System.out.print("Nhap nam sinh moi: ");
            s.setYearOfBirth(sc.nextInt());
            sc.nextLine();

            System.out.print("Nhap dia chi moi: ");
            s.setAddress(sc.nextLine());

            System.out.print("Nhap TX1 moi: ");
            s.setTX1(sc.nextFloat());

            System.out.print("Nhap TX2 moi: ");
            s.setTX2(sc.nextFloat());

            System.out.print("Nhap KTHP moi: ");
            s.setKTHP(sc.nextFloat());

            System.out.print("Nhap so tiet nghi moi: ");
            s.setDayOff(sc.nextInt());

            System.out.println(" Da cap nhat thong tin sinh vien.");
            found = true;
            break;
        }
    }
    if (!found) System.out.println(" Khong tim thay sinh vien.");
}

    public static void xoaSinhVien(ArrayList<Student> list) {
    sc.nextLine();
    System.out.print("Nhap ten sinh vien can xoa: ");
    String name = sc.nextLine();

    boolean removed = list.removeIf(s -> s.getName().equalsIgnoreCase(name));
    if (removed)
        System.out.println("Da xoa sinh vien khoi danh sach.");
    else
        System.out.println("Khong tim thay sinh vien.");
}

    
    public static void reAge(ArrayList<Student> list) {
        list.sort((s1, s2) -> Integer.compare(s1.getYearOfBirth(), s2.getYearOfBirth()));
    }
    public static void reGPA(ArrayList<Student> list) {
        list.sort((s1, s2) -> Float.compare(s1.getGPA(), s2.getGPA()));
    }
    public static void reDayOff(ArrayList<Student> list) {
        list.sort((s1, s2) -> Integer.compare(s1.getDayOff(), s2.getDayOff()));
    }
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Nguyen Van A", 2000, "1235 Nguyen Trai", 8.53f, 9.30f, 7.45f, 24));
        list.add(new Student("Nguyen Van B", 2002, "1233 Nguyen Trai", 8.54f, 9.04f, 7.55f, 23));
        list.add(new Student("Nguyen Van C", 2004, "1243 Nguyen Trai", 8.55f, 9.50f, 7.35f, 22));
        list.add(new Student("Nguyen Van D", 2006, "1233 Nguyen Trai", 8.544f, 9.034f, 7.355f, 243));
        list.add(new Student("Nguyen Van E", 2005, "1243 Nguyen Trai", 8.545f, 9.450f, 7.354f, 252));

        show(list);
        int choose;
        do{
            System.out.printf("\n-----------Quan Ly Sinh Vien-----------%n1. Them sinh vien moi%n2. Sua thong tin sinh vien%n3. Sap xep sinh vien theo tuoi%n4. Sap xep sinh vien theo GPA%n5. Sap xep sinh vien theo so tiet nghi%n6. Xoa sinh vien khoi danh sach%n7. Thoat!%n");
            choose= sc.nextInt();
            if(choose == 1){
                System.out.println("Them sinh vien moi:");
                themSinhVien(list);
                show(list);
            }
            if(choose == 2){
                System.out.println("Sua thong tin sinh vien:");
                suaSinhVien(list);
                show(list);
            }
            if(choose == 3){
                System.out.println("Sap xep sinh vien theo tuoi:");
                reAge(list);
                show(list);
            }
            if(choose == 4){
                System.out.println("Sap xep sinh vien theo GPA:");
                reGPA(list);
                show(list);
            }
            if(choose == 5){
                System.out.println("Sap xep sinh vien theo so tiet nghi:");
                reDayOff(list);
                show(list);
            }
            if(choose == 6){
                System.out.println("Xoa sinh vien khoi danh sach:");
                xoaSinhVien(list);
                show(list);
            }
            if(choose == 7){
                System.out.println("Exit");
                break;
            }
        }
        while (choose >0);
    }
}
