package For8.banking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
    private List<Account> accounts;
    private String firstName,lastName;
    private  Account savingAccount,checkingAccount;
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account account) {
        this.accounts.add(account) ;
    }

    public Account getAccount(int index) {
        return accounts.get(index);
    }

    public int getNumOfAccounts() {
        return accounts.size();
    }
    public Account getSavings(){
        return savingAccount;
    }
    public void setSavings(Account savingAccount){
        this.savingAccount = savingAccount;

    }

    public Account getChecking() {
        return checkingAccount;
    }

    public void setChecking(Account checkingAccount) {
        this.checkingAccount = checkingAccount;
    }
    public Iterator<Account> getAccounts(){
        return accounts.iterator();
    }
}
