package Buoi7.Class.Bai3.p4;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Playable> instruments = new ArrayList<>();
        instruments.add(new Piano());
        instruments.add(new Guitar());
        for (Playable instrument : instruments) {
            instrument.play();
        }
    }
}
