package Buoi6;


class Animal {
    public void sound() {
        System.out.println("Động vật phát ra âm thanh");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Chó sủa: Gâu gâu!");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();

        a.sound(); // Động vật phát ra âm thanh
        b.sound(); // Chó sủa: Gâu gâu!
    }
}

