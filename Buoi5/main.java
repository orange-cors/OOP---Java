package Buoi5;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        cage cage1 = new cage("Cage001", new ArrayList<>(), 0);
        cage cage2 = new cage("Cage002", new ArrayList<>(), 0);

        pet dog = new pet("Buddy", 12.5, "Dog");
        pet cat = new pet("Whiskers", 8.0, "Cat");
        pet rabbit = new pet("Fluffy", 3.5, "Rabbit");
        pet parrot = new pet("Polly", 1.2, "Parrot");

        cage1.addPet(dog);
        cage1.addPet(cat);
        cage1.addPet(rabbit);
        cage2.addPet(parrot);
        System.out.println("Danh sach thu long 1: ");
        cage1.printAllPets();
        System.out.println("Danh sach thu long 2: ");
        cage2.printAllPets();
        System.out.println("Danh sach thu nang hon 10kg(long 1):");
        for(pet p : cage1.pets) {
            if (p.isOWeight()) {
                p.printInfo();
            }
        }
        System.out.println("Danh sach thu nang hon 10kg(Long 2):");
        boolean check = false;
        for(pet p : cage2.pets) {
            if (p.isOWeight()) {
                p.printInfo();
                check = true;
            }
        }
        if (!check) {
            System.out.println("No pets over 10kg in this cage.");
        }
    }
}