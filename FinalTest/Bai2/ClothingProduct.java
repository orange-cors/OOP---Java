package FinalTest.Bai2;

public class ClothingProduct extends Product{
    @Override
    public double getDiscountPrice(double price){
        return 0.8*price;
    }

}