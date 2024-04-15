public class ProductDisplay {
    void display(Product product) {
        System.out.println(String.format("Product: \n \t Name: %s \n \t Price: %f \n \t Type: %s \n",
                product.name, product.price, product.type));
    }
}