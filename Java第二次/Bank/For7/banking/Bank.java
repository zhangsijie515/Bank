package For7.banking;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;
    public Bank(){
        customers = new Customer[10];
    }
    private static Bank bank =new Bank();
    public static Bank getBank(){
        return bank;
    }

    public void addCustomer(String firstName, String lastName){
        Customer customer = new Customer(firstName,lastName);
        customers[numberOfCustomers++] = customer;

    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {

        return customers[index];
    }


}
