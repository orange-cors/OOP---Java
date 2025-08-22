package Buoi7.Cau3;

class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public void display() {
        System.out.println("Street: " + street + ", City: " + city);
    }
}
