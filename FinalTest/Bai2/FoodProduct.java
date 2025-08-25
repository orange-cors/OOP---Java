package FinalTest.Bai2;

public class FoodProduct extends Product{
    @Override
    public double getDiscountPrice(double price){
        return 0.95*price;
    }

}