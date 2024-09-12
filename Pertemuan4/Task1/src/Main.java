// Main.java (tidak memiliki deklarasi package)
import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 14000000, 10);
        Sales sales = new Sales(product);

        sales.sellProduct(5);
        sales.restockProduct(10);
        sales.updateProductPrice(15000000);
        sales.updateProductPrice(-5000000);
    }
}
