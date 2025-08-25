package FinalTest.Bai2;

public class ElectronicProduct extends Product{
    @Override
    public double getDiscountPrice(double price){
        return 0.9*price;
    }

}