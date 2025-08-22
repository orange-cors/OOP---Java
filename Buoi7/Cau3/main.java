package Buoi7.Cau3;

public class main {
    public static void main(String[] args) {
        Address addr = new Address("123 Nguyen Trai", "Ha Noi");
        Person p = new Person("Nguyen Van A", addr);

        p.display();
    }
}
