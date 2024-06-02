class Customer {
    private Account account;

    // Constructor
    public Customer(Account account) {
        this.account = account;
    }

    // Getter for account
    public Account getAccount() {
        return account;
    }

    // Method to get balance directly from Customer
    public double getBalance() {
        return account.getBalance();
    }
}