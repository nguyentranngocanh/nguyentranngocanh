public class TestMain {
    public static void main(String[] args) {
        // Create a new customer object
        Customer customer1 = new Customer(1, "John Doe", 'F');

        // Test getter methods
        System.out.println("ID: " + customer1.getId());
        System.out.println("Name: " + customer1.getName());
        System.out.println("Gender: " + customer1.getGender());


        // Test getters after setting new values
        System.out.println("Updated Name: " + customer1.getName());
        System.out.println("Updated Gender: " + customer1.getGender());

        // Test toString method
        System.out.println(customer1);

        Account account1 = new Account(1001, customer1, 500.0);

        // Test the getter methods
        System.out.println("Account ID: " + account1.getId());
        System.out.println("Customer Info: " + account1.getCustomer());
        System.out.println("Balance: " + account1.getBalance());

        // Test deposit method
        account1.deposit(200.0);
        System.out.println("Balance after deposit: " + account1.getBalance());

        // Test withdraw method
        account1.withdraw(100.0);
        System.out.println("Balance after withdrawal: " + account1.getBalance());

        // Test withdraw method with insufficient balance
        account1.withdraw(700.0);

        // Test toString method
        System.out.println(account1);
    }
}