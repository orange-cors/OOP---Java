package Buoi4.Bai3;

public class Bai3 {
    
    public static void main(String[] args) {
        Car s = new Car("BatMobile", 990);
        if(s.getSpeed() > 90){
            System.out.println("Xe dang chay voi toc do qua nhanh");
        } else {
            System.out.println("Xe dang chay voi toc do an toan");
        }
        s.run();
    }
}
