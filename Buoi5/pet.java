package Buoi5;

public class pet {
    private String name;
    private double weight;
    private String species;


    public pet(String name, double weight, String species) {
        this.name = name;
        this.weight = weight;
        this.species = species;
    }

    void printInfo() {
        System.out.println("Name [" + name + "], Species [" + species + "], Weight [" + weight + "]");
    }

    public boolean isOWeight() {
        if(weight > 10) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getBasicInfo() {
        return "Name: " + name + ", Species: " + species;
    }
    
}