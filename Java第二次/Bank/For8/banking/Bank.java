package For8.banking;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Bank {
   private List<Customer> customers;
    private Bank(){
        customers = new ArrayList<>();
    }
    private static Bank bank =new Bank();
    public static Bank getBank(){
        return bank;
    }

    public void addCustomer(String firstName, String lastName){
        customers.add(new Customer(firstName,lastName));

    }

    public int getNumOfCustomers() {
        return customers.size();
    }

    public Customer getCustomer(int index) {

        return customers.get(index);
    }
    public Iterator<Customer> getCustomers(){
        return customers.iterator();
    }


}
