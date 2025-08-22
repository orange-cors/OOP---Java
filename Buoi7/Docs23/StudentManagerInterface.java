package Buoi7.Docs23;
public interface StudentManagerInterface {
    void sortByScoreDesc();
    void sortByScoreAsc();
    Student findByName(String name);
    void printStudents();
}
