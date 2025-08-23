package Buoi7.Class.Bai1.p3;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
