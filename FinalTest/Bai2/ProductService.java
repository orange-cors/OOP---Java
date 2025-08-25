package FinalTest.Bai2;

public interface ProductService {
    public void addProduct(Product p);
    public void updateProduct(String id, Product newInfo);
    public void deleteProduct(String id);
    public Product findByName(String name);
    public void sortByPriceAsc(double price);
    public void sortByPriceDesc(double price);
    public void printProduct(String id, String name, double price, int quantity, String category, Manufacturer manufacturer){
        System.out.println("ID |" + " Name |" + " Category |"+ " Manufacturer(Name) |"+ " Quantity |"+ " Price |"+ " DiscountPrice");
        System.out.println();
    }
}
