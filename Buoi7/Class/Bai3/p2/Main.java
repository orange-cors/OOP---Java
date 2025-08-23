package Buoi7.Class.Bai3.p2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Bird()};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
