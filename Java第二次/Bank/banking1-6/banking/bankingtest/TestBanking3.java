package banking.banking.bankingtest;

import banking.banking.Account;
import banking.banking.Customer;
import banking.banking.OverdraftException;

public class TestBanking3 {public static void main(String[] args) throws OverdraftException {
    Customer customer = new Customer("Jane","Smith");
    Account account = new Account(500);

    // Create an account that can has a 500.00 balance.
    System.out.println("Creating the customer Jane Smith.");
    //code
    System.out.println("Creating her account with a 500.00 balance.");
    customer.addAccount(account);
    //code
    // Perform some account transactions
    System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
    System.out.println("Deposit 22.50: " + account.deposit(22.50));
    System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
    System.out.println("Withdraw 400.00: " + account.withdraw(400.00));

    // Print out the final account balance
    System.out.println("Customer [" + customer.getLastName()
            + ", " + customer.getFirstName()
            + "] has a balance of " + account.getBalance());
}
}
