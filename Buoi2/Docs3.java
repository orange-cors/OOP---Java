package Buoi2;
import java.util.Scanner;
public class Docs3 {

    public static int[][] MaTranXoanOc(int n) {
        int[][] a = new int[n][n];

        int gt = 1;
        int top = 0, bot = n - 1;
        int lef = 0, rig = n - 1;

        while (gt <= n*n) {
            for (int i = lef; i <= rig; i++) {
                a[top][i] = gt++;
            }
            top++;
            for (int i = top; i <= bot; i++) {
                a[i][rig] = gt++;
            }
            rig--;
            for (int i = rig; i >= lef; i--) {
                a[bot][i] = gt++;
            }
            bot--;
            for (int i = bot; i >= top; i--) {
                a[i][lef] = gt++;
            }
            lef++;
        }

        return a;
    }

    public static void xuatMaTran(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Nhap kich thuoc n: ");
            int n = sc.nextInt();
            if (n < 1 || n > 50) {
                System.out.println("Kich thuoc mang khong hop le.");
                return;
            }
            int[][] Res = MaTranXoanOc(n);
            System.out.println("Ma tran xoan oc:");
            xuatMaTran(Res, n);
        }
    }
}
