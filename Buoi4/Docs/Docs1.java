package Buoi4.Docs;
import java.util.ArrayList;
public class Docs1 {

    public static void show(ArrayList<Student> list) {
        System.out.printf("%-20s %-10s %-20s %-10s %-10s %-10s %-10s %-10s\n", "Name", "Age", "Address", "TX1", "TX2", "KTHP", "GPA", "Day Off");
        for (Student s : list) {
            System.out.printf("%-20s %-10d %-20s %-10.2f %-10.2f %-10.2f %-10.2f %-10d\n", s.getName(), s.getYearOfBirth(), s.getAddress(), s.getTX1(), s.getTX2(), s.getKTHP(), (s.getTX1()*0.2 + s.getTX2()*0.3 + s.getKTHP()*0.5), s.getDayOff());
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Nguyen Van A", 2000, "1235 Nguyen Trai", 8.53f, 9.30f, 7.45f, 24));
        list.add(new Student("Nguyen Van B", 2002, "1233 Nguyen Trai", 8.54f, 9.04f, 7.55f, 23));
        list.add(new Student("Nguyen Van C", 2004, "1243 Nguyen Trai", 8.55f, 9.50f, 7.35f, 22));
        list.add(new Student("Nguyen Van D", 2006, "1233 Nguyen Trai", 8.544f, 9.034f, 7.355f, 243));
        list.add(new Student("Nguyen Van E", 2005, "1243 Nguyen Trai", 8.545f, 9.450f, 7.354f, 252));

        show(list);
    }
}
