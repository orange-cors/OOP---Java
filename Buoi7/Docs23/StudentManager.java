package Buoi7.Docs23;
import java.util.ArrayList;
public class StudentManager implements StudentManagerInterface {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    @Override
    public void printStudents() {
        System.out.println("ID | Name | Age | Email | Class | Address | Score | Grade");
        for (Student s : students) {
            System.out.println(
                s.getId() + " | " +
                s.getName() + " | " +
                s.getAge() + " | " +
                s.getEmail() + " | " +
                s.getClassName() + " | " +
                s.getAddress() + " | " +
                s.getScore() + " | " +
                s.getGrade()
            );
        }
    }
    @Override
    public void sortByScoreDesc() {
        students.sort((s1, s2) -> Double.compare(s2.getScore(), s1.getScore()));
    }

    @Override
    public void sortByScoreAsc() {
        students.sort((s1, s2) -> Double.compare(s1.getScore(), s2.getScore()));
    }

    @Override
    public Student findByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public void addStudent(Student s) {
        students.add(s);
    }   
}
