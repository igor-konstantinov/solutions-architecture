public class Bank {
    private Customer customer;

    // Constructor
    public Bank(Customer customer) {
        this.customer = customer;
    }

    // Getter for customer
    public Customer getCustomer() {
        return customer;
    }

    // Method to get balance directly from Bank
    public double getCustomerBalance() {
        return customer.getBalance();
    }
}