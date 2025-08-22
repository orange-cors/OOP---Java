package Buoi5;

import java.util.ArrayList;

public class cage {
    private String cageCode;
    ArrayList<pet> pets;
    private int currentPetcount;
    static int totalCages;
    final int MAX_CAPACITY = 3;

    public cage(String cageCode, ArrayList<pet> pets, int totalCages) {
        this.cageCode = cageCode;
        this.pets = new ArrayList<>();
        totalCages++;
    }

    public void addPet(pet p) {
        if (currentPetcount < MAX_CAPACITY) {
            pets.add(p);
            currentPetcount++;
        } else {
            System.out.println("Cage is full, cannot add more pets.");
        }
    }

    public void printAllPets() {
        System.out.println("Cage Code: " + cageCode);
        for (pet p : pets) {
            p.printInfo();
        }
    }

}