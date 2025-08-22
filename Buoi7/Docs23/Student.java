package Buoi7.Docs23;

public class Student {
    private String id;
    private String name;
    private double score;
    private int age;
    private String email;
    private String className;
    private String address;

    public Student(String id, String name, double score, int age, String email, String className, String address) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.age = age;
        this.email = email;
        this.className = className;
        this.address = address;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getScore() {
        return score;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getClassName() {
        return className;
    }
    public String getAddress() {
        return address;
    }
    

    public String getGrade() {
        if (score >= 8) {
            return "A";
        } else if (score >= 6 || score < 8) {
            return "B";
        } else if (score >= 4 || score < 6) {
            return "C";
        } else {
            return "D";
        }
    }
}
