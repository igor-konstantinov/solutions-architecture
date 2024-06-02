public class Customer {
    private String name;
    private String address;

    // Constructor
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to calculate shipping cost based on the address
    public double getShippingCost() {
        if (address.contains("New York")) {
            return 5.00;
        } else if (address.contains("California")) {
            return 10.00;
        } else {
            return 15.00;
        }
    }
}