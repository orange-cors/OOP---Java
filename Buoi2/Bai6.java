package Buoi2;
import java.util.Scanner;
public class Bai6 {

    
    String name;
    int age;
    double gpa;
    static Scanner sc = new Scanner(System.in);
    
    public void Nhap(){
        System.out.print("Nhap ten: ");
        sc.nextLine();
        name = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        age = sc.nextInt();

        System.out.print("Nhap GPA: ");
        gpa = sc.nextDouble();
    }
    
    public static void NhapThongTin(Bai6[] sv, int soluongSinhVien){
        for(int i=0 ; i<soluongSinhVien ; i++){
            System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1) + ":");
            sv[i] = new Bai6();
            sv[i].Nhap();
        }
    }
    
    public static void InDanhsach(Bai6[] sv, int soluongSinhVien){
        System.out.println("\nDanh sach sinh vien:");
        for(int i=0;i<soluongSinhVien;i++){
            System.out.print("Sinh vien " + (i + 1) + ": " + sv[i].name + " | Tuoi: " + sv[i].age + " | GPA: " + sv[i].gpa + "\n");
        }
    }

    public static void TinhTBC(Bai6[] sv, int soluongSinhVien){
    
        double tongGPA = 0;
        double maxGPA = sv[0].gpa;

        for(int i=0;i<soluongSinhVien;i++){
            tongGPA += sv[i].gpa;
            if(sv[i].gpa > maxGPA){
                maxGPA = sv[i].gpa;
            }    
        }

        double GPATrungBinh = tongGPA / soluongSinhVien;
        System.out.printf("GPA trung binh cua tat ca sinh vien la: %.2f\n", GPATrungBinh);

        for(int i=0;i<soluongSinhVien;i++){
            if(sv[i].gpa == maxGPA){
                System.out.println("Sinh vien co GPA cao nhat la: " + sv[i].name + " - GPA: " + sv[i].gpa);
            }    
        }
    }

    public static void main(String[] args){
            int soluongSinhVien;
            System.out.print("Nhap so luong sinh vien: ");
            soluongSinhVien = sc.nextInt();

            Bai6[] sv = new Bai6[soluongSinhVien];

            NhapThongTin(sv, soluongSinhVien);
            InDanhsach(sv, soluongSinhVien);
            TinhTBC(sv, soluongSinhVien);
    }
}
