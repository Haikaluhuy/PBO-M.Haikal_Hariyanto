import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class MainProgram {
    public static void main(String[] args) {
        // Buat objek Product
        Product product = new Product("Laptop", 1000.0, 10);

        // Buat objek Sales
        Sales sales = new Sales(product);

        // Lakukan penjualan produk
        sales.sellProduct(5);

        // Lakukan restock produk
        sales.restockProduct(20);

        // Perbarui harga produk
        sales.updateProductPrice(1200.0);

        // Coba memperbarui harga produk dengan nilai negatif
        sales.updateProductPrice(-500.0);
    }
}
