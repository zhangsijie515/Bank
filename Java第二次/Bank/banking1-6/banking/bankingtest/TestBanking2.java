package banking.banking.bankingtest;

import For8.banking.Account;
import For8.banking.Customer;
import For8.banking.OverdraftException;

public class TestBanking2 {

    public static void main(String[] args) throws OverdraftException {
        Customer customer = null;
        Account account = null;

        // Create an account that can has a 500.00 balance.
        account = new Account(500);
        System.out.println("Creating the customer Jane Smith.");
        customer = new Customer("Jane","Smith");
        //code
        System.out.println("Creating her account with a 500.00 balance.");
        customer.addAccount(account);
        //code
        System.out.println("Withdraw 150.00");
        customer.getAccount(0).withdraw(150.00);

        //code
        System.out.println("Deposit 22.50");
        customer.getAccount(0).deposit(22.50);
        //code
        System.out.println("Withdraw 47.62");
        customer.getAccount(0).withdraw(47.62);
        //code
        // Print out the final account balance
        System.out.println("Customer [" + customer.getLastName()
                + ", " + customer.getFirstName()
                + "] has a balance of " + account.getBalance());
    }
}
