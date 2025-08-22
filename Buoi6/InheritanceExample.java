package Buoi6;

class Animal {
    String name;

    public void eat() {
        System.out.println(name + " đang ăn.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println(name + " đang sủa.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Milo";
        dog.eat();  // từ lớp cha
        dog.bark(); // từ lớp con
    }
}