package Buoi4.Bai1;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void sayHello() {
        System.out.println("Xin chao, toi ten la [" + name + "] nam nay [" + age + "] tuoi");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return name;
    }
    public void setAge(String name) {
        this.name = name;
    }
}
