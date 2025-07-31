package Buoi4.Docs;

public class Student {
    private String name;
    private int yearOfBirth;
    private String address;
    private float TX1;
    private float TX2;
    private float KTHP;
    private int dayOff;

    public Student(String name, int yearOfBirth, String address, float TX1, float TX2, float KTHP, int dayOff) {
        this.name = name;
        this.yearOfBirth = 2025 - yearOfBirth;
        this.address = address;
        this.TX1 = TX1;
        this.TX2 = TX2;
        this.KTHP = KTHP;
        this.dayOff = dayOff;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = 2025 - yearOfBirth;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public float getTX1() {
        return TX1;
    }
    public void setTX1(float TX1) {
        this.TX1 = TX1;
    }
    public float getTX2() {
        return TX2;
    }
    public void setTX2(float TX2) {
        this.TX2 = TX2;
    }
    public float getKTHP() {
        return KTHP;
    }
    public void setKTHP(float KTHP) {
        this.KTHP = KTHP;
    }
    public float getGPA() {
        return (TX1 * 0.2f + TX2 * 0.3f + KTHP * 0.5f);
    }
    public int getDayOff() {
        return dayOff;
    }
    public void setDayOff(int dayOff) {
        this.dayOff = dayOff;
    }
}
