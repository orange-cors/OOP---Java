package FinalTest.Bai2;
import java.util.ArrayList;
import java.util.Collection;
public class ProductServiceImpl implements ProductService {
    ArrayList<Product> products;

    @Override
    public void addProduct(Product p) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteProduct(String id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Product findByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void printProduct() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sortByPriceAsc(double price) {
        Collections.sort(products, (Product a, Product b) -> Double.compareDouble(a,b));
    }

    @Override
    public void sortByPriceDesc(double price) {
        Collections.sort(products, (Product a, Product b) -> Double.compareDouble(a,b));
        
    }

    @Override
    public void updateProduct(String id, Product newInfo) {
        // TODO Auto-generated method stub
        
    }
    
}