package banking.banking.bankingtest;

import banking.banking.Bank;
import banking.banking.Customer;

public class TestBanking4 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jane","Simms");
        // Add Customer Jane, Simms
        //code
        bank.addCustomer("Owen","Bryant");
        //Add Customer Owen, Bryant
        //code
        bank.addCustomer("Tim","Soley");
        // Add Customer Tim, Soley
        //code
        bank.addCustomer("Maria","Soley");
        // Add Customer Maria, Soley
        //code
        for ( int i = 0; i < bank.getNumOfCustomers(); i++ ) {
            Customer customer = bank.getCustomer(i);

            System.out.println("Customer [" + (i+1) + "] is "
                    + customer.getLastName()
                    + ", " + customer.getFirstName());
        }
    }
}
