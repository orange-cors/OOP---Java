package Buoi6;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Fruits List: " + fruits);

        fruits.remove("Banana");
        System.out.println("After Del: " + fruits);

        System.out.println("First Ele: " + fruits.get(0));
    }
}