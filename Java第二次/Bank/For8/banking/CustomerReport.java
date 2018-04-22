package For8.banking;

import java.util.Iterator;

public class CustomerReport {
    public void generateReport(){
        Bank bank = Bank.getBank();
        Customer customer = null;
        // Generate a report
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");
        Iterator<Customer> customerIterator=bank.getCustomers();
        while (customerIterator.hasNext()){
            customer = customerIterator.next();

            System.out.println();
            System.out.println("Customer: " + customer.getLastName() + ", "
                    + customer.getFirstName());
            Iterator<Account>  accountIterator = customer.getAccounts();

                while (accountIterator.hasNext()){
                Account account = accountIterator.next();
                String account_type = "";

                // Determine the account type
                /***
                 * Step 1: Use the instanceof operator to test what type of
                 * account we have and set account_type to an appropriate value,
                 * such as "Savings Account" or "Checking Account".
                 ***/
                if(account instanceof SavingAccount){
                    account_type = "Savings Account";
                }else if(account instanceof CheckingAccount){
                    account_type = "Checking Account";
                }

                // Print the current balance of the account
                /***
                 * Step 2: Print out the type of account and the balance. Feel
                 * free to use the currency_format formatter to generate a
                 * "currency string" for the balance.
                 ***/
                System.out.println(account_type + ": current balance is " + account.getBalance());

            }
        }
    }
}
