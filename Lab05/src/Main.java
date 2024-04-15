public class Main {
    public static void main(String[] args) {
        Product product = new Product("productName", 3.50, "productType");
        new ProductDisplay().display(product);
    }
}