public class Main {
    public static void main(String[] args) {
        // Creating instances and using the refactored approach
        Bank bank = new Bank(new Customer(new Account(1000)));
        double balance = bank.getCustomerBalance();
        System.out.println("The balance is: " + balance);
    }
}