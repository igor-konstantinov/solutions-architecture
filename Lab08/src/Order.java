public class Order {
    private Customer customer;
    private String product;
    private int quantity;

    // Constructor
    public Order(Customer customer, String product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    // Method to print order details
    public void printOrderDetails() {
        System.out.println("Order for " + product + " x " + quantity);
        System.out.println("Shipping to " + customer.getAddress());
        System.out.println("Shipping cost: $" + customer.getShippingCost());
    }
}