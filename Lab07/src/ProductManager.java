import java.util.List;
import java.util.ArrayList;

class ProductManager {
    private List<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void printProductDetails(int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                product.printDetails();
                return;
            }
        }
    }
}